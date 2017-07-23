
package com.jfixby.r3.assets.packer;

import java.io.IOException;

import com.jfixby.r3.fokker.FOKKER_SYSTEM_ASSETS;
import com.jfixby.r3.rana.api.pkg.io.BankHeaderInfo;
import com.jfixby.scarabei.api.desktop.ScarabeiDesktop;
import com.jfixby.scarabei.api.file.File;
import com.jfixby.scarabei.api.file.LocalFileSystem;
import com.jfixby.scarabei.api.json.Json;
import com.jfixby.scarabei.api.log.L;
import com.jfixby.scarabei.gson.GoogleGson;

public class RebuildFokkerBank {

	public static void main (final String[] args) throws IOException {
		ScarabeiDesktop.deploy();
		Json.installComponent(new GoogleGson());

		final String outputAssetsFolderPathString = "";
		final File outputFolder = LocalFileSystem.ApplicationHome().child("output");
		outputFolder.makeFolder();

		final BankHeaderInfo bankHeader = new BankHeaderInfo();
		bankHeader.bank_name = FOKKER_SYSTEM_ASSETS.LOCAL_BANK_NAME;

		final File bankFolder = outputFolder.child(bankHeader.bank_name);
		bankFolder.makeFolder();

		final File bankHeaderFile = bankFolder.child(BankHeaderInfo.FILE_NAME);
		L.d("writing", bankHeaderFile);
		bankHeaderFile.writeString(Json.serializeToString(bankHeader).toString());

	}

}
