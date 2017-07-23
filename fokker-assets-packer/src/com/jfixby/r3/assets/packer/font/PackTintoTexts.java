
package com.jfixby.r3.assets.packer.font;

import java.io.IOException;

import com.jfixby.r3.assets.packer.tinto.TintoAssetsConfig;
import com.jfixby.r3.ext.api.text.TextLocalization;
import com.jfixby.r3.ext.api.text.TextPackage;
import com.jfixby.r3.ext.api.text.TextPackageEntry;
import com.jfixby.r3.rana.api.pkg.io.PackageDescriptor;
import com.jfixby.r3.rana.red.pkg.bank.PackageUtils;
import com.jfixby.rana.api.pkg.StandardPackageFormats;
import com.jfixby.scarabei.adopted.gdx.json.GdxJson;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.assets.Names;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.List;
import com.jfixby.scarabei.api.collections.Set;
import com.jfixby.scarabei.api.desktop.ScarabeiDesktop;
import com.jfixby.scarabei.api.file.File;
import com.jfixby.scarabei.api.file.FilesList;
import com.jfixby.scarabei.api.file.LocalFileSystem;
import com.jfixby.scarabei.api.json.Json;

public class PackTintoTexts {

	static String RU = "русский";
	static String EN = "english";
	static String IT = "italiano";

	public static final void main (final String[] arg) throws IOException {
		ScarabeiDesktop.deploy();
		Json.installComponent(new GdxJson());

		final FilesList langFiles = LocalFileSystem.ApplicationHome().child("input").child("ru").listDirectChildren();

		final File bank = LocalFileSystem.newFile(TintoAssetsConfig.TINTO_REMOTE_ASSETS_HOME).child("tank-0");

		final ID package_id = Names.newID("com.jfixby.tinto.text");
		final File package_folder = bank.child(package_id.toString());
		package_folder.makeFolder();
		package_folder.clearFolder();

		final File package_content_folder = package_folder.child(PackageDescriptor.PACKAGE_CONTENT_FOLDER);
		package_content_folder.makeFolder();
		final TextPackage root = new TextPackage();
		final List<ID> packed_texts = Collections.newList();
		final Set<ID> required = Collections.newSet();
		for (int i = 2; i <= 20; i++) {
			final String index = ("" + (1000 + i)).substring(1, 4);
			final String scene_id = ".scene-" + index;
			final ID text_id = Names.newID(package_id.toString() + scene_id + ".txt");
			final ID string_id_prefix = Names.newID(package_id.parent().child("strings").toString() + scene_id + ".txt");
			add(text_id, string_id_prefix, root, i, packed_texts, langFiles, scene_id, required);
// L.d("----");
		} // com.jfixby.tinto.text.scene-002.txt

		final String localizations_list_file_name = package_id.child(TextPackage.PACKAGE_FILE_EXTENSION).toString();
		final File root_file = package_content_folder.child(localizations_list_file_name);
		final String root_data = Json.serializeToString(root).toString();
		root_file.writeString(root_data);

		PackageUtils.producePackageDescriptor(package_folder, StandardPackageFormats.RedTriplane.Text, "1.0", packed_texts,
			required, localizations_list_file_name);
	}

	private static void add (final ID text_id, final ID string_id_prefix, final TextPackage root, final int locale_index,
		final List<ID> packed_texts, final FilesList langFiles, final String scene_id, final Set<ID> required) throws IOException {

		final TextPackageEntry entry = new TextPackageEntry();
		entry.id = text_id.toString();
		root.entries.add(entry);
		packed_texts.add(text_id);

		{
			final TextLocalization localization = new TextLocalization();
			entry.localizations.add(localization);
			localization.name = RU;
			final ID locale_id = string_id_prefix.child(localization.name);
			localization.container_id = locale_id.toString();
			required.add(locale_id);
		}
		{
			final TextLocalization localization = new TextLocalization();
			entry.localizations.add(localization);
			localization.name = EN;
			final ID locale_id = string_id_prefix.child(localization.name);
			localization.container_id = locale_id.toString();
			required.add(locale_id);
		}
		{
			final TextLocalization localization = new TextLocalization();
			entry.localizations.add(localization);
			localization.name = IT;
			final ID locale_id = string_id_prefix.child(localization.name);
			localization.container_id = locale_id.toString();
			required.add(locale_id);
		}

	}
}
