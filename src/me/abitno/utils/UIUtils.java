/**
 * 
 */

package me.abitno.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.app.FragmentActivity;

/**
 * 
 * @author crossle
 */
public class UIUtils {
	public static boolean hasHoneycomb() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
	}

	public static boolean hasHoneycombMR1() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1;
	}

	public static boolean hasICS() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
	}

	/**
	 * return (context.getResources().getConfiguration().screenLayout &
	 * Configuration.SCREENLAYOUT_SIZE_MASK) >=
	 * Configuration.SCREENLAYOUT_SIZE_LARGE;
	 * 
	 * @param context
	 * @return
	 */
	public static boolean isTablet(Context context) {
		return false;
	}

	public static boolean isHoneycombTablet(Context context) {
		return hasHoneycomb() && isTablet(context);
	}

	public static boolean isNetworkAvailable(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
		if (activeNetwork == null || !activeNetwork.isConnected()) {
			return false;
		}
		return true;
	}

	public static ImageFetcher getImageFetcher(final FragmentActivity activity) {
		// The ImageFetcher takes care of loading remote images into our ImageView
		ImageFetcher fetcher = new ImageFetcher(activity);
		fetcher.setImageCache(ImageCache.findOrCreateCache(activity, "imageFetcher"));
		return fetcher;
	}

}