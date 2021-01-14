package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.Charset;

/* renamed from: X.25h  reason: invalid class name and case insensitive filesystem */
public final class C455525h extends AbstractC34411iR {
    public int A00;
    public AnonymousClass15G A01;
    public byte[] A02;

    public C455525h() {
        super(false);
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        AnonymousClass15G r0 = this.A01;
        if (r0 != null) {
            return r0.A05;
        }
        return null;
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r6) {
        A01();
        this.A01 = r6;
        Uri uri = r6.A05;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] split = uri.getSchemeSpecificPart().split(",", -1);
            if (split.length == 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new AnonymousClass12D(AnonymousClass008.A0K("Error while parsing Base64 encoded string: ", str), e);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, "US-ASCII").getBytes(Charset.forName("UTF-8"));
                }
                A03(r6);
                return (long) this.A02.length;
            }
            throw new AnonymousClass12D(AnonymousClass008.A0J("Unexpected URI format: ", uri));
        }
        throw new AnonymousClass12D(AnonymousClass008.A0K("Unsupported scheme: ", scheme));
    }

    @Override // X.AnonymousClass15E
    public void close() {
        if (this.A02 != null) {
            this.A02 = null;
            A00();
        }
        this.A01 = null;
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i2, i4);
        System.arraycopy(bArr2, i3, bArr, i, min);
        this.A00 += min;
        A02(min);
        return min;
    }
}
