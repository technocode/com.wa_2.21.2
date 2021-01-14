package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.03s  reason: invalid class name and case insensitive filesystem */
public class C007703s {
    public static volatile C007703s A03;
    public final Set A00 = new HashSet();
    public final Set A01 = new HashSet();
    public volatile Set A02 = new HashSet();

    public static C007703s A00() {
        if (A03 == null) {
            synchronized (C007703s.class) {
                if (A03 == null) {
                    A03 = new C007703s();
                }
            }
        }
        return A03;
    }

    public static StatResult A01(String str) {
        try {
            return StatResult.lstatOpenFile(str);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static Collection A02(int i, File... fileArr) {
        if (fileArr == null || i == 0) {
            return Collections.emptyList();
        }
        int length = fileArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (File file : fileArr) {
            try {
                StatResult A012 = A01(file.getPath());
                if (!A012.A05) {
                    if (file.isDirectory()) {
                        arrayList.addAll(A02(i - 1, file.listFiles()));
                    } else if (A012.A01 == 1) {
                        arrayList.add(Long.valueOf(A012.A04));
                    }
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("externalfilevalidator/file read error: ");
                sb.append(file);
                Log.e(sb.toString(), e);
            }
        }
        return arrayList;
    }

    public void A03(Uri uri) {
        if (this.A00.contains(uri.getAuthority())) {
            throw new IOException(AnonymousClass008.A0J("externalfilevalidator/don't allow sharing ", uri));
        }
    }

    public void A04(ParcelFileDescriptor parcelFileDescriptor) {
        StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(parcelFileDescriptor.getFileDescriptor()));
        StringBuilder sb = new StringBuilder("parcelFileDescriptor=");
        sb.append(parcelFileDescriptor);
        A05(statOpenFile, sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r2 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[SYNTHETIC, Splitter:B:21:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[SYNTHETIC, Splitter:B:27:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.whatsapp.util.StatResult r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703s.A05(com.whatsapp.util.StatResult, java.lang.String):void");
    }

    public void A06(FileInputStream fileInputStream) {
        StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(fileInputStream.getFD()));
        StringBuilder sb = new StringBuilder("fileInputStream=");
        sb.append(fileInputStream);
        A05(statOpenFile, sb.toString());
    }
}
