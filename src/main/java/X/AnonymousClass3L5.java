package X;

import java.io.Writer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3L5  reason: invalid class name */
public final class AnonymousClass3L5 implements AnonymousClass0GO {
    public static final Set A01 = new HashSet(Arrays.asList("name", "short", "notify", "vpa", "receiver-alias", "sender-alias", "receiver-vpa", "sender-vpa", "vpa-name", "account-name", "payee-name", "amount", "total-amount", "upi-bank-info", "ifsc-code", "account-ref-id", "balance", "usable-balance", "debit-last-6", "debit-exp-month", "debit-exp-year", "otp", "mpin", "old-mpin", "new-mpin", "atm-pin", "bank-transaction-id", "currency", "mcc", "ref-url", "qr-code", "signed-qr-code", "seq-no", "verification-data", "jws-token", "token-id", "trusted-device-info", "mandate-no", "original-amount", "mandate-info", "expiry-ts"));
    public static final Set A02 = new HashSet(Arrays.asList("user", "chat", "message", "transaction", "account", "pay", "bank", "upi", "mandate", "mandate-update"));
    public static final Set A03 = new HashSet(Arrays.asList("body", "message", "enc", "picture", "contact", "pin"));
    public final Writer A00;

    public AnonymousClass3L5(Writer writer) {
        this.A00 = writer;
    }

    public final void A00(AnonymousClass0M5 r10) {
        Writer writer = this.A00;
        writer.write(60);
        String str = r10.A00;
        writer.write(str);
        AnonymousClass0OS[] A0I = r10.A0I();
        int i = 0;
        if (A0I != null) {
            for (int i2 = 0; i2 < A0I.length; i2++) {
                writer.write(32);
                writer.write(A0I[i2].A02);
                writer.write("='");
                String str2 = A0I[i2].A02;
                if (A02.contains(str) && A01.contains(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0I[i2].A03.getBytes().length);
                    sb.append(" bytes");
                    writer.write(sb.toString());
                } else if (A0I[i2].A00 == 1) {
                    writer.write(String.valueOf(A0I[i2].A01));
                } else {
                    A01(A0I[i2].A03.getBytes());
                }
                writer.write(39);
            }
        }
        byte[] bArr = r10.A01;
        if (bArr == null && r10.A03 == null) {
            writer.write("/>");
        } else if (bArr != null) {
            writer.write(62);
            if (A03.contains(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bArr.length);
                sb2.append(" bytes");
                writer.write(sb2.toString());
            } else {
                A01(bArr);
            }
            writer.write("</");
            writer.write(str);
            writer.write(62);
        } else {
            writer.write(62);
            while (true) {
                AnonymousClass0M5[] r1 = r10.A03;
                if (i < r1.length) {
                    A00(r1[i]);
                    i++;
                } else {
                    writer.write("</");
                    writer.write(str);
                    writer.write(62);
                    return;
                }
            }
        }
    }

    public final void A01(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if (b < 33 || b == 37 || b > 126) {
                sb.append('%');
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            } else {
                sb.append((char) b);
            }
        }
        this.A00.write(sb.toString());
    }

    @Override // X.AnonymousClass0GO
    public synchronized void AQK() {
        Writer writer = this.A00;
        writer.write("</stream:stream>");
        writer.flush();
    }

    @Override // X.AnonymousClass0GO
    public synchronized void ARM(AnonymousClass0M5 r2) {
        ARN(r2, 1);
    }

    @Override // X.AnonymousClass0GO
    public synchronized void ARN(AnonymousClass0M5 r3, int i) {
        if (r3 == null) {
            this.A00.write(32);
        } else {
            A00(r3);
        }
        if ((i & 1) != 0) {
            this.A00.flush();
        }
    }

    @Override // X.AnonymousClass0GO
    public byte[] ARO(AnonymousClass0M5 r2) {
        throw new UnsupportedOperationException();
    }
}
