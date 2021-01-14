package X;

import android.os.ConditionVariable;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Iz  reason: invalid class name and case insensitive filesystem */
public class C04090Iz {
    public static C04090Iz A01 = new C04090Iz();
    public AnonymousClass0J0 A00;

    public String A00() {
        File file;
        Throwable th;
        AnonymousClass0J0 r0 = this.A00;
        ArrayList latestLogs = Log.getLatestLogs(1);
        if (latestLogs.size() < 1) {
            Log.e("debug-builder/upload-logs no logs found to be uploaded.");
        } else {
            if (!r0.A0F.A00.getBoolean("in_log_del_on_upgrade", false)) {
                AnonymousClass01I r2 = r0.A03;
                r2.A04();
                if (r2.A00 == null || r0.A0P.A06()) {
                    Log.e("debug-builder/upload-logs can not upload logs");
                    return null;
                }
            }
            File file2 = (File) latestLogs.get(0);
            if (file2.length() > 8388608) {
                file = C006803i.A0C(r0.A0A, file2, 8388608, 41943040);
                if (file == null) {
                    return null;
                }
            } else {
                file = file2;
            }
            StringBuffer stringBuffer = new StringBuffer();
            ConditionVariable conditionVariable = new ConditionVariable();
            AnonymousClass0J1 r8 = new AnonymousClass0J1(stringBuffer, conditionVariable);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Uploading logs from ");
                    sb.append(file);
                    sb.append(" to ");
                    sb.append("https://crashlogs.whatsapp.net/wa_clb_data");
                    Log.d(sb.toString());
                    AnonymousClass0J3 A012 = r0.A0J.A01("https://crashlogs.whatsapp.net/wa_clb_data", r8);
                    List list = A012.A0D;
                    list.add(Pair.create("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af"));
                    try {
                        A012.A04(fileInputStream, "file", file.getName(), 0, file.length());
                        list.add(Pair.create("type", "support"));
                        AnonymousClass009 r82 = r0.A02;
                        list.add(Pair.create("from", r82.A01()));
                        list.add(Pair.create("forced", "true"));
                        if (!(r82 instanceof AnonymousClass00L)) {
                            throw new RuntimeException("Must use overridden implementation");
                        }
                        list.add(Pair.create("android_hprof_extras", ((AnonymousClass00L) r82).A08(null).A00()));
                        A012.A01(null);
                        fileInputStream.close();
                        conditionVariable.block(100000);
                        StringBuilder sb2 = new StringBuilder("returning ");
                        sb2.append((Object) stringBuffer);
                        Log.d(sb2.toString());
                        if (stringBuffer.length() != 0) {
                            if (!file.getAbsolutePath().equals(file2.getAbsolutePath())) {
                                file.delete();
                            }
                            return stringBuffer.toString();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Exception e) {
                Log.e(e);
                return null;
            }
        }
        return null;
        throw th;
    }
}
