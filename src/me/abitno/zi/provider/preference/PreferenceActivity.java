/*
 * Copyright (C) 2011 Cedric Fung (wolfplanet@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.abitno.zi.provider.preference;

import android.content.SharedPreferences;
import android.os.Bundle;

public class PreferenceActivity extends android.preference.PreferenceActivity {
	private CursorSharedPreferences mPref;

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		mPref = new CursorSharedPreferences(this);
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public SharedPreferences getSharedPreferences(String name, int mode) {
		return mPref;
	}

}