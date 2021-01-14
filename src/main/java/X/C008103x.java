package X;

import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import com.facebook.soloader.Api18TraceUtils;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.03x  reason: invalid class name and case insensitive filesystem */
public class C008103x extends AbstractC007903v {
    public final int A00;
    public final File A01;

    public C008103x(File file, int i) {
        this.A01 = file;
        this.A00 = i;
    }

    public int A02(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, " not found on ");
            A0Y.append(file.getCanonicalPath());
            Log.d("SoLoader", A0Y.toString());
            return 0;
        }
        StringBuilder A0Y2 = AnonymousClass008.A0Y(str, " found on ");
        A0Y2.append(file.getCanonicalPath());
        Log.d("SoLoader", A0Y2.toString());
        if ((i & 1) == 0 || (this.A00 & 2) == 0) {
            if ((this.A00 & 1) != 0) {
                boolean z = SoLoader.A0A;
                if (z) {
                    Api18TraceUtils.A00("SoLoader.getElfDependencies[", file2.getName());
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        String[] A1w = C001801b.A1w(fileInputStream.getChannel());
                        StringBuilder A0S = AnonymousClass008.A0S("Loading lib dependencies: ");
                        A0S.append(Arrays.toString(A1w));
                        Log.d("SoLoader", A0S.toString());
                        for (String str2 : A1w) {
                            if (!str2.startsWith("/")) {
                                SoLoader.A04(str2, null, (i | 1) & -3, threadPolicy);
                            }
                        }
                    } finally {
                        fileInputStream.close();
                    }
                } finally {
                    if (z) {
                        Trace.endSection();
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Not resolving dependencies for ");
                sb.append(str);
                Log.d("SoLoader", sb.toString());
            }
            try {
                SoLoader.A02.ABm(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    Log.d("SoLoader", "Corrupted lib file detected");
                    return 3;
                }
                throw e;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" loaded implicitly");
            Log.d("SoLoader", sb2.toString());
            return 2;
        }
    }

    @Override // X.AbstractC007903v
    public String toString() {
        String str;
        try {
            str = String.valueOf(this.A01.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A01.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }
}
