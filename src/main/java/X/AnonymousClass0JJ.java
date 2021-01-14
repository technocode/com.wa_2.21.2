package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0JJ  reason: invalid class name */
public final class AnonymousClass0JJ {
    public static final Executor A00 = C006803i.A0P(0, 2, TimeUnit.SECONDS, "Google Drive Write Worker #");
    public static volatile AnonymousClass0JJ A01;

    public static int A00(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 6;
            case 12:
                return 15;
            case 13:
                return 3;
            case 14:
                return 5;
            case 15:
                return 8;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return 9;
            case 17:
                return 10;
            case 18:
                return 11;
            case 19:
                return 12;
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                return 13;
            case 21:
                return 14;
            case 22:
            default:
                return 2;
            case 23:
                return 16;
            case 24:
                return 18;
            case 25:
                return 17;
        }
    }

    public static long A01(List list) {
        long j;
        Iterator it = list.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.exists()) {
                j = 1;
                if (file.isDirectory()) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(file);
                    j = 0;
                    while (linkedList.peek() != null) {
                        Object poll = linkedList.poll();
                        if (poll != null) {
                            File[] listFiles = ((File) poll).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    if (file2.exists()) {
                                        if (file2.isDirectory()) {
                                            linkedList.add(file2);
                                        } else {
                                            j += file2.length() > 0 ? 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    continue;
                } else if (file.length() > 0) {
                }
                j2 += j;
            }
            j = 0;
            j2 += j;
        }
        return j2;
    }

    public static Dialog A02(AnonymousClass01X r6, int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-util/get-error-dialog creating dialog for ");
        A0S.append(A04(i));
        Log.i(A0S.toString());
        AnonymousClass1QN r4 = new AnonymousClass1QN(i, activity, i2);
        AnonymousClass0MB r3 = new AnonymousClass0MB(activity);
        AnonymousClass0MC r5 = r3.A01;
        r5.A0J = false;
        r3.A05(r6.A06(R.string.skip), new AnonymousClass1QM(onCancelListener));
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            int i3 = R.string.google_drive_error_google_play_services_are_missing_message_at_restore_time;
            if (z) {
                i3 = R.string.google_drive_error_google_play_services_are_missing_message_at_backup_time;
            }
            r5.A0I = r6.A06(R.string.google_drive_error_google_play_services_are_missing_title);
            r5.A0E = r6.A06(i3);
            r3.A07(r6.A06(R.string.google_drive_error_google_play_services_are_missing_positive_button_label), r4);
            return r3.A00();
        } else if (i == 2) {
            int i4 = R.string.google_drive_error_google_play_services_updation_required_message_at_restore_time;
            if (z) {
                i4 = R.string.google_drive_error_google_play_services_updation_required_message_at_backup_time;
            }
            r5.A0I = r6.A06(R.string.google_drive_error_google_play_services_updation_required_title);
            r5.A0E = r6.A06(i4);
            r3.A07(r6.A06(R.string.google_drive_error_google_play_services_update_required_positive_button_label), r4);
            return r3.A00();
        } else if (i != 3) {
            boolean z2 = true;
            if (i != 18) {
                if (i == 1) {
                    z2 = AnonymousClass0LV.A02(activity);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                i = 18;
            }
            return AnonymousClass0LP.A00.A03(activity, i, i2, onCancelListener);
        } else {
            int i5 = R.string.google_drive_error_google_play_services_disabled_message_at_restore_time;
            if (z) {
                i5 = R.string.google_drive_error_google_play_services_disabled_message_at_backup_time;
            }
            r5.A0I = r6.A06(R.string.google_drive_error_google_play_services_disabled_title);
            r5.A0E = r6.A06(i5);
            r3.A07(r6.A06(R.string.google_drive_error_google_play_services_disabled_positive_button_label), r4);
            return r3.A00();
        }
    }

    public static AnonymousClass0JJ A03() {
        if (A01 == null) {
            synchronized (AnonymousClass0JJ.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0JJ();
                }
            }
        }
        return A01;
    }

    public static String A04(int i) {
        if (i == 0) {
            return "success";
        }
        if (i == 1) {
            return "service-missing";
        }
        if (i == 2) {
            return "service-version-update-required";
        }
        if (i == 3) {
            return "service-disabled";
        }
        if (i != 9) {
            return i != 18 ? AnonymousClass008.A0F("unexpected-return-code: ", i) : "service-updating";
        }
        return "service-invalid";
    }

    public static String A05(int i) {
        switch (i) {
            case 10:
                return "none";
            case 11:
                return "auth-failed";
            case 12:
                return "account-missing";
            case 13:
                return "google-drive-full";
            case 14:
                return "google-drive-not-reachable";
            case 15:
                return "local-storage-full";
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return "local-chat-backup-missing";
            case 17:
                return "file-not-found";
            case 18:
                return "base-folder-does-not-exist";
            case 19:
                return "gdrive-servers-are-not-working-properly";
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                return "failed-to-authenticate-with-whatsapp-servers";
            case 21:
                return "gps-unavailable";
            case 22:
                return "local-gdrive-file-map-is-missing";
            case 23:
                return "read-external-storage-permission-is-missing";
            case 24:
                return "backup-generated-using-newer-version-of-app";
            case 25:
                return "service-disabled";
            default:
                throw new IllegalArgumentException(AnonymousClass008.A0F("unexpected error: ", i));
        }
    }

    public static String A06(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "daily";
        }
        if (i == 2) {
            return "weekly";
        }
        if (i == 3) {
            return "monthly";
        }
        if (i == 4) {
            return "manual";
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("Unexpected backup frequency: ", i));
    }

    public static String A07(AnonymousClass009 r6, AnonymousClass03R r7, String str, Context context) {
        String str2;
        boolean startsWith = str.startsWith("_INTERNAL_FILES_");
        if (!startsWith && !str.startsWith("_INTERNAL_DATABASES_")) {
            return new File(r7.A02, str).getAbsolutePath();
        }
        if ("_INTERNAL_DATABASES_/chatsettings.db".equals(str)) {
            AnonymousClass008.A18("gdrive-util/convert-upload-title-to-local-path/ignored-file-skipped-from-backup ", str);
            return null;
        }
        if (startsWith) {
            try {
                str2 = str.replace("_INTERNAL_FILES_", context.getFilesDir().getAbsolutePath());
            } catch (IOException e) {
                Log.e("gdrive-util/upload-title-to-local-path", e);
                return null;
            }
        } else if (str.startsWith("_INTERNAL_DATABASES_")) {
            str2 = str.replace("_INTERNAL_DATABASES_", context.getDatabasePath("dummy.db").getParentFile().getAbsolutePath());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-util/upload-title-to-local-path/unexpected-title: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        String canonicalPath = new File(str2).getCanonicalPath();
        AbstractCollection abstractCollection = (AbstractCollection) A0F(context);
        HashSet hashSet = new HashSet(abstractCollection.size());
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            hashSet.add(new File(((File) it.next()).getCanonicalPath()));
        }
        if (hashSet.contains(new File(canonicalPath))) {
            return canonicalPath;
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("gdrive-util/convert-upload-title-to-local-path/local-path-unexpected/return-null ", canonicalPath, " not in [");
        A0Z.append(TextUtils.join(" ", hashSet));
        A0Z.append("]");
        Log.e(A0Z.toString());
        r6.A03("gdrive: upload title maps to invalid local path", 7);
        return null;
    }

    public static String A08(AnonymousClass03R r9, Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        if (r9.A06(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(r9.A02.getAbsolutePath());
            sb.append("/");
            String replace = absolutePath.replace(sb.toString(), "");
            if (!replace.startsWith("_INTERNAL_FILES_") && !replace.startsWith("_INTERNAL_DATABASES_")) {
                return replace;
            }
            AnonymousClass008.A17("gdrive-util/local-path-to-upload-title/malicious-file-name: ", replace);
            return null;
        }
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        if (absolutePath.startsWith(absolutePath2)) {
            String replace2 = absolutePath.replace(absolutePath2, "_INTERNAL_FILES_");
            String.format(Locale.ENGLISH, "gdrive-util/local-path-to-upload-title %s -> %s", absolutePath, replace2);
            return replace2;
        }
        String absolutePath3 = context.getDatabasePath("dummy.db").getParentFile().getAbsolutePath();
        if (absolutePath.startsWith(absolutePath3)) {
            String replace3 = absolutePath.replace(absolutePath3, "_INTERNAL_DATABASES_");
            String.format(Locale.ENGLISH, "gdrive-util/local-path-to-upload-title %s -> %s", absolutePath, replace3);
            return replace3;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0K("Unexpected file: ", absolutePath));
    }

    public static String A09(AnonymousClass03R r2, AnonymousClass03S r3, File file, long j) {
        try {
            try {
                return C006803i.A0I(file, j, MessageDigest.getInstance("MD5"));
            } catch (IOException e) {
                if (!r2.A06(file) || r3.A06()) {
                    Log.e("gdrive-util/get-message-digest", e);
                    return null;
                }
                throw new C41461v5(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String A0A(C44041zP r6) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[10];
        Integer num = r6.A0B;
        if (num != null) {
            str = num.toString();
        } else {
            str = "undefined";
        }
        objArr[0] = str;
        Double d = r6.A06;
        if (d != null) {
            i = (int) d.doubleValue();
        } else {
            i = -1;
        }
        objArr[1] = Integer.valueOf(i);
        Double d2 = r6.A02;
        if (d2 != null) {
            i2 = (int) d2.doubleValue();
        } else {
            i2 = -1;
        }
        objArr[2] = Integer.valueOf(i2);
        Double d3 = r6.A04;
        if (d3 != null) {
            i3 = (int) d3.doubleValue();
        } else {
            i3 = -1;
        }
        objArr[3] = Integer.valueOf(i3);
        Double d4 = r6.A03;
        if (d4 != null) {
            i4 = (int) d4.doubleValue();
        } else {
            i4 = -1;
        }
        objArr[4] = Integer.valueOf(i4);
        objArr[5] = r6.A0F;
        objArr[6] = r6.A00;
        objArr[7] = r6.A0D;
        objArr[8] = r6.A0A;
        objArr[9] = r6.A09;
        return String.format(locale, "api:%s, total size:%d, chat size:%d, media size:%d, media files count:%d retryCount:%d includeVideos:%b wifi-on-finish:%b failure-stage:%d result:%d", objArr);
    }

    public static String A0B(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("@");
        if (indexOf <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        sb.append("***");
        sb.append(str.substring(indexOf - 1));
        return sb.toString();
    }

    public static String A0C(String str, Map map) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public static String A0D(String str, String... strArr) {
        int length = strArr.length;
        if (length == 0) {
            return str;
        }
        if (length % 2 != 0) {
            StringBuilder A0S = AnonymousClass008.A0S("gdrive-util/append-query-parameters/odd number of params - ");
            A0S.append(length);
            Log.e(A0S.toString());
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (int i = 0; i < length; i += 2) {
            buildUpon.appendQueryParameter(strArr[i], strArr[i + 1]);
        }
        return buildUpon.build().toString();
    }

    public static Set A0E(Context context) {
        HashSet hashSet = new HashSet();
        hashSet.add(AnonymousClass02J.A03(context));
        StringBuilder sb = new StringBuilder("gdrive-util/get-internal-files-for-backup [");
        sb.append(TextUtils.join(", ", hashSet));
        sb.append("]");
        Log.i(sb.toString());
        return hashSet;
    }

    public static Set A0F(Context context) {
        Set A0E = A0E(context);
        ((AbstractCollection) A0E).add(context.getDatabasePath("chatsettingsbackup.db"));
        StringBuilder sb = new StringBuilder("gdrive-util/get-internal-files-for-restore [");
        sb.append(TextUtils.join(", ", A0E));
        sb.append("]");
        Log.i(sb.toString());
        return A0E;
    }

    public static void A0G(Context context, Intent intent) {
        intent.setClass(context, GoogleBackupService.class);
        C004302a.A06(context, intent);
    }

    public static boolean A0H(Activity activity) {
        if (C002001d.A3D(activity)) {
            return true;
        }
        if (!(activity instanceof RestoreFromBackupActivity) || !((RestoreFromBackupActivity) activity).A0G) {
            return (activity instanceof SettingsGoogleDrive) && ((SettingsGoogleDrive) activity).A0L;
        }
        return true;
    }

    public static boolean A0I(AnonymousClass00D r1) {
        return r1.A06() == 1;
    }

    public static boolean A0J(AnonymousClass00D r2) {
        return r2.A06() == 2;
    }

    public static boolean A0K(File file, AnonymousClass088 r4) {
        try {
            return r4.A0K(file);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("gdrive-util/in-media-folder ");
            sb.append(file);
            Log.e(sb.toString(), e);
            return false;
        }
    }

    public static boolean A0L(File file, AnonymousClass00D r10, C000300f r11, AnonymousClass088 r12) {
        boolean z;
        boolean z2;
        if (r12 != null) {
            try {
                z = file.getCanonicalPath().startsWith(r12.A04().A0L.getCanonicalPath());
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("gdrive-util/should-backup/in-video-folder ");
                sb.append(file);
                Log.e(sb.toString(), e);
                z = false;
            }
            if (!r10.A00.getBoolean("gdrive_include_videos_in_backup", false) && z) {
                return false;
            }
            long A06 = ((long) (r11.A06(AbstractC000400g.A3a) << 1)) * 1048576;
            long A062 = ((long) (r11.A06(AbstractC000400g.A32) << 1)) * 1048576;
            if (r12 != null) {
                try {
                    z2 = file.getCanonicalPath().startsWith(r12.A04().A02.getCanonicalPath());
                } catch (IOException e2) {
                    StringBuilder sb2 = new StringBuilder("gdrive-util/should-backup-in-document-folder ");
                    sb2.append(file);
                    Log.e(sb2.toString(), e2);
                    z2 = false;
                }
                long length = file.length();
                if (z2) {
                    A06 = A062;
                }
                if (length > A06) {
                    file.getAbsolutePath();
                    file.length();
                    return false;
                }
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(".");
                if (lastIndexOf != -1 && lastIndexOf != name.length() - 1) {
                    return true;
                }
                file.getAbsolutePath();
                return false;
            }
            throw null;
        }
        throw null;
    }

    public static boolean A0M(File file, boolean z, String str, C02290Bk r9) {
        AnonymousClass1Y3 A03;
        if (file == null || !file.exists() || !z) {
            Log.i("gdrive-util/validate local msgstore does not exist or is unusable");
            return false;
        } else if (file.length() == 0) {
            Log.i("gdrive-util/validate local msgstore exists but is empty.");
            return false;
        } else {
            boolean z2 = true;
            if (!(str == null || (A03 = C02290Bk.A03(file.getName())) == null)) {
                try {
                    AnonymousClass1QD A012 = AnonymousClass1QA.A00(A03, r9.A04, r9.A0T, file).A01();
                    if (A012 == null || !A012.A02(str)) {
                        z2 = false;
                    }
                } catch (IOException e) {
                    Log.e("msgstore/has-jid-mismatch/failed to read backup footer", e);
                    z2 = false;
                }
            }
            if (!z2) {
                return true;
            }
            Log.i("gdrive-util/validate local msgstore exists but for a different jid.");
            return false;
        }
    }
}
