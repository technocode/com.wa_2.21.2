package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;

/* renamed from: X.2ty  reason: invalid class name and case insensitive filesystem */
public class C61932ty {
    public static volatile C61932ty A0B;
    public C61572tO A00;
    public C61962u1 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass0GP A05;
    public final C61202sf A06;
    public final C61762th A07;
    public final C018809u A08 = C018809u.A00("PaymentPinHelper", "network", "COMMON");
    public final C61902tv A09;
    public final C61942tz A0A;

    public C61932ty(AnonymousClass00G r9, AnonymousClass00S r10, AnonymousClass02M r11, AnonymousClass01I r12, C61202sf r13, AnonymousClass04j r14, C61942tz r15, C03340Fu r16, AnonymousClass0GP r17, C61902tv r18, C61762th r19) {
        this.A04 = r9;
        this.A02 = r11;
        this.A06 = r13;
        this.A03 = r14;
        this.A0A = r15;
        this.A05 = r17;
        this.A09 = r18;
        this.A07 = r19;
        this.A01 = new C61962u1(r10, r16);
        this.A00 = new C61572tO(r9.A00, r11, r14, r16, r17, r19, "PIN");
    }

    public static C61932ty A00() {
        if (A0B == null) {
            synchronized (C61932ty.class) {
                if (A0B == null) {
                    A0B = new C61932ty(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass01I.A00(), C61202sf.A00(), AnonymousClass04j.A00(), C61942tz.A00(), C03340Fu.A00(), AnonymousClass0GP.A00(), C61902tv.A00(), C61762th.A00());
                }
            }
        }
        return A0B;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: byte[][] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] A01(Object... objArr) {
        int length = objArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                if (objArr[i2] == null) {
                    bArr[i2] = new byte[0];
                } else if (objArr[i2] instanceof Long) {
                    bArr[i2] = String.valueOf(((Number) objArr[i2]).longValue()).getBytes("UTF-8");
                } else if (objArr[i2] instanceof Integer) {
                    bArr[i2] = String.valueOf(((Number) objArr[i2]).intValue()).getBytes("UTF-8");
                } else if (objArr[i2] instanceof byte[]) {
                    bArr[i2] = objArr[i2];
                } else if (objArr[i2] instanceof String) {
                    bArr[i2] = ((String) objArr[i2]).getBytes("UTF-8");
                } else {
                    throw new IllegalArgumentException(C018809u.A01("PaymentPinHelper", "constructPayload: should only accept long, byte[], and String args"));
                }
                i += bArr[i2].length;
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb = new StringBuilder(" UTF-8 not supported: ");
                sb.append(e);
                Log.e(C018809u.A01("PaymentPinHelper", sb.toString()));
                throw new Error(e);
            }
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Object[] objArr2 = bArr[i4];
            System.arraycopy(objArr2, 0, bArr2, i3, objArr2.length);
            i3 += objArr2.length;
        }
        return bArr2;
    }

    public final void A02(String str, AbstractC61912tw r5, AbstractC61922tx r6) {
        C68653Ea A022 = this.A07.A02(str, "PIN", true);
        if (A022 == null) {
            this.A00.A00(str, new C68873Ew(r5, r6));
        } else {
            r5.AJb(new C61952u0(A022));
        }
    }
}
