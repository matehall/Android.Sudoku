package org.example.sudoku;


import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Prefs extends PreferenceActivity{
	@Override
	protected void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
}
