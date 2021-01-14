package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.0LS  reason: invalid class name */
public final class AnonymousClass0LS {
    public static final AnonymousClass05W A00 = new AnonymousClass05W();

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C04660Lg.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String A01(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_enable_button);
    }

    public static String A02(Context context, int i) {
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, A002);
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, A002);
            } else if (i == 5) {
                return A05(context, "common_google_play_services_invalid_account_text", A002);
            } else {
                if (i == 7) {
                    return A05(context, "common_google_play_services_network_error_text", A002);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, A002);
                } else if (i == 20) {
                    return A05(context, "common_google_play_services_restricted_profile_text", A002);
                } else {
                    switch (i) {
                        case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                            return A05(context, "common_google_play_services_api_unavailable_text", A002);
                        case 17:
                            return A05(context, "common_google_play_services_sign_in_failed_text", A002);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, A002);
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, A002);
                    }
                }
            }
        } else if (C001801b.A1m(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, A002);
        }
    }

    public static String A03(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return A04(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return A04(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return A04(context, "common_google_play_services_sign_in_failed_title");
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return A04(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String A04(Context context, String str) {
        Resources resources;
        String str2;
        String str3;
        AnonymousClass05W r4 = A00;
        synchronized (r4) {
            String str4 = (String) r4.getOrDefault(str, null);
            if (str4 != null) {
                return str4;
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str3 = "Missing resource: ".concat(valueOf);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str2 = "Got empty resource: ".concat(valueOf2);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            r4.put(str, string);
            return string;
        }
    }

    public static String A05(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String A04 = A04(context, str);
        if (A04 == null) {
            A04 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, A04, str2);
    }
}
