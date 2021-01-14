package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1ae  reason: invalid class name and case insensitive filesystem */
public class C30051ae extends C05050Mz {
    @Override // X.C05050Mz
    public Typeface A02(Context context, Resources resources, int i, String str, int i2) {
        try {
            FontFamily build = new FontFamily.Builder(new Font.Builder(resources, i).build()).build();
            int i3 = 400;
            if ((i2 & 1) != 0) {
                i3 = 700;
            }
            int i4 = 0;
            if ((i2 & 2) != 0) {
                i4 = 1;
            }
            return new Typeface.CustomFallbackBuilder(build).setStyle(new FontStyle(i3, i4)).build();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // X.C05050Mz
    public Typeface A03(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // X.C05050Mz
    public C14780ms A04(C14780ms[] r3, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        throw r0;
     */
    @Override // X.C05050Mz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r12, android.os.CancellationSignal r13, X.C14780ms[] r14, int r15) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30051ae.A05(android.content.Context, android.os.CancellationSignal, X.0ms[], int):android.graphics.Typeface");
    }

    @Override // X.C05050Mz
    public Typeface A06(Context context, AnonymousClass0NL r12, Resources resources, int i) {
        AnonymousClass0NG[] r6 = r12.A00;
        int length = r6.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            AnonymousClass0NG r7 = r6[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, r7.A00).setWeight(r7.A02);
                if (!r7.A04) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(r7.A01).setFontVariationSettings(r7.A03).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = 400;
        if ((i & 1) != 0) {
            i5 = 700;
        }
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }
}
