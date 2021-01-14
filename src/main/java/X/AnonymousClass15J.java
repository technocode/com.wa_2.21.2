package X;

import java.io.IOException;

/* renamed from: X.15J  reason: invalid class name */
public class AnonymousClass15J extends IOException {
    public final AnonymousClass15G dataSpec;
    public final int type;

    public AnonymousClass15J(IOException iOException, AnonymousClass15G r2, int i) {
        super(iOException);
        this.dataSpec = r2;
        this.type = i;
    }

    public AnonymousClass15J(String str, AnonymousClass15G r3) {
        super(str);
        this.dataSpec = r3;
        this.type = 1;
    }

    public AnonymousClass15J(String str, IOException iOException, AnonymousClass15G r4) {
        super(str, iOException);
        this.dataSpec = r4;
        this.type = 1;
    }
}
