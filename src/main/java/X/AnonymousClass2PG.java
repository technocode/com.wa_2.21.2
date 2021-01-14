package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2PG  reason: invalid class name */
public class AnonymousClass2PG {
    public int A00 = 0;
    public int A01;
    public Point A02;
    public Rect A03;
    public AnonymousClass36I A04;
    public File A05;
    public File A06;
    public Byte A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Uri A0F;

    public AnonymousClass2PG(Uri uri) {
        this.A0F = uri;
    }

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized Point A01() {
        return this.A02;
    }

    public synchronized File A02() {
        return this.A05;
    }

    public synchronized File A03() {
        File file;
        file = this.A05;
        if (file == null) {
            file = this.A06;
        }
        return file;
    }

    public synchronized File A04() {
        return this.A06;
    }

    public synchronized Byte A05() {
        return this.A07;
    }

    public synchronized String A06() {
        return this.A08;
    }

    public synchronized String A07() {
        return this.A09;
    }

    public synchronized String A08() {
        return this.A0B;
    }

    public synchronized void A09(Byte b) {
        this.A07 = b;
    }

    public synchronized void A0A(String str) {
        this.A08 = str;
    }

    public synchronized void A0B(String str) {
        this.A0B = str;
    }

    public synchronized boolean A0C() {
        return this.A0E;
    }
}
