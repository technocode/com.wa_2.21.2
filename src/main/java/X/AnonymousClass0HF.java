package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.Me;
import com.whatsapp.usernotice.UserNoticeContentWorker;
import com.whatsapp.usernotice.UserNoticeIconWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0HF  reason: invalid class name */
public class AnonymousClass0HF {
    public static volatile AnonymousClass0HF A07;
    public AnonymousClass352 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass01X A03;
    public final AnonymousClass0HG A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass0GU A06;

    public AnonymousClass0HF(AnonymousClass00G r1, AnonymousClass01I r2, AnonymousClass00T r3, AnonymousClass01X r4, AnonymousClass0GU r5, AnonymousClass0HG r6) {
        this.A02 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A06 = r5;
        this.A04 = r6;
    }

    public static AnonymousClass0HF A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0HF.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0HF(AnonymousClass00G.A01, AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass01X.A00(), AnonymousClass0GU.A00(), AnonymousClass0HG.A00());
                }
            }
        }
        return A07;
    }

    public static final File A01(Context context, int i) {
        File A022 = A02(context.getFilesDir(), "user_notice");
        if (A022 == null) {
            return null;
        }
        return A02(A022, String.valueOf(i));
    }

    public static File A02(File file, String str) {
        File file2 = new File(file, str);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeContentManager/getDir/could not make directory ");
        A0S.append(file2.getAbsolutePath());
        Log.e(A0S.toString());
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass352 A03(X.AnonymousClass357 r6) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HF.A03(X.357):X.352");
    }

    public void A04(int i) {
        AnonymousClass008.A0v("UserNoticeContentManager/deleteUserNoticeData/notice id: ", i);
        File A012 = A01(this.A02.A00, i);
        if (A012 != null) {
            this.A05.ANF(new RunnableEBaseShape4S0100000_I0_4(A012, 29));
        }
        this.A00 = null;
    }

    public void A05(int i) {
        String str;
        EnumC06980Vl r7 = EnumC06980Vl.EXPONENTIAL;
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/getUserNoticeContent/notice id ");
        sb.append(i);
        Log.i(sb.toString());
        HashMap hashMap = new HashMap();
        hashMap.put("notice_id", Integer.valueOf(i));
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        Me me = r0.A00;
        if (me == null) {
            AnonymousClass008.A0u("UserNoticeContentManager/getUserNoticeContent/could not create notice uri for notice id ", i);
            return;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v1").appendQueryParameter("id", String.valueOf(i));
        AnonymousClass01X r3 = this.A03;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("lg", r3.A04()).appendQueryParameter("lc", r3.A03()).appendQueryParameter("cc", C03190Fd.A01(me.cc)).appendQueryParameter("platform", "android");
        if (this.A02.A00.getResources().getDisplayMetrics().densityDpi <= 240) {
            str = "hdpi";
        } else {
            str = "xxhdpi";
        }
        Uri build = appendQueryParameter2.appendQueryParameter("img-size", str).build();
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeContentManager/getUserNoticeUri/uri: ");
        A0S.append(build.toString());
        Log.d(A0S.toString());
        hashMap.put("url", build.toString());
        C17550rj r4 = new C17550rj(hashMap);
        C17550rj.A01(r4);
        C17520rg r1 = new C17520rg();
        r1.A03 = EnumC07010Vo.CONNECTED;
        C17530rh r8 = new C17530rh(r1);
        C31001cM r32 = new C31001cM(UserNoticeContentWorker.class);
        r32.A01.add("tag.whatsapp.usernotice.content.fetch");
        r32.A00.A09 = r8;
        r32.A02(r7, 1, TimeUnit.HOURS);
        r32.A00.A0A = r4;
        AnonymousClass0s0 A002 = r32.A00();
        C31001cM r42 = new C31001cM(UserNoticeIconWorker.class);
        r42.A01.add("tag.whatsapp.usernotice.icon.fetch");
        r42.A00.A09 = r8;
        r42.A02(r7, 1, TimeUnit.HOURS);
        C17550rj r12 = new C17550rj(hashMap);
        C17550rj.A01(r12);
        r42.A00.A0A = r12;
        AnonymousClass0s0 A003 = r42.A00();
        String A0F = AnonymousClass008.A0F("tag.whatsapp.usernotice.content.fetch.", i);
        EnumC17570rl r82 = EnumC17570rl.REPLACE;
        List singletonList = Collections.singletonList(A002);
        C31221cl r6 = (C31221cl) ((AbstractC17680ry) this.A06.get());
        if (!singletonList.isEmpty()) {
            C31101cY r5 = new C31101cY(r6, A0F, r82, singletonList, null);
            List singletonList2 = Collections.singletonList(A003);
            if (!singletonList2.isEmpty()) {
                r5 = new C31101cY(r5.A03, r5.A04, EnumC17570rl.KEEP, singletonList2, Collections.singletonList(r5));
            }
            r5.A00();
            return;
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public final void A06(AnonymousClass352 r4, int i) {
        A07(r4.A01, "banner_icon_light.png", "banner_icon_dark.png", i);
        A07(r4.A03, "modal_icon_light.png", "modal_icon_dark.png", i);
        A07(r4.A02, "blocking_modal_icon_light.png", "blocking_modal_icon_dark.png", i);
    }

    public final void A07(AnonymousClass356 r3, String str, String str2, int i) {
        if (r3 != null) {
            if (A09(i, str, str2)) {
                File A012 = A01(this.A02.A00, i);
                r3.A01 = new File(A012, str);
                r3.A00 = new File(A012, str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(int r5, java.lang.String r6, java.io.InputStream r7) {
        /*
            r4 = this;
            r3 = 0
            X.00G r0 = r4.A02     // Catch:{ IOException -> 0x0039 }
            android.app.Application r0 = r0.A00     // Catch:{ IOException -> 0x0039 }
            java.io.File r2 = A01(r0, r5)     // Catch:{ IOException -> 0x0039 }
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0039 }
            r1.<init>()     // Catch:{ IOException -> 0x0039 }
            java.lang.String r0 = "UserNoticeContentWorker/storeUserNoticeContent/storing user notice for "
            r1.append(r0)     // Catch:{ IOException -> 0x0039 }
            r1.append(r5)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0039 }
            com.whatsapp.util.Log.i(r0)     // Catch:{ IOException -> 0x0039 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0039 }
            r0.<init>(r2, r6)     // Catch:{ IOException -> 0x0039 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0039 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0039 }
            X.C006803i.A0d(r7, r1)     // Catch:{ all -> 0x0032 }
            r0 = 1
            r1.close()
            return r0
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/storeUserNoticeContent/failed to store"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HF.A08(int, java.lang.String, java.io.InputStream):boolean");
    }

    public final boolean A09(int i, String... strArr) {
        File[] listFiles;
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArr);
        File A012 = A01(this.A02.A00, i);
        if (!(A012 == null || (listFiles = A012.listFiles()) == null)) {
            for (File file : listFiles) {
                hashSet.remove(file.getName());
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/userNoticeFilesExist/notice id ");
        sb.append(i);
        sb.append(" files exists: ");
        sb.append(isEmpty);
        Log.i(sb.toString());
        return isEmpty;
    }
}
