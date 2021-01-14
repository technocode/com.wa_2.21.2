package X;

import com.whatsapp.Conversation;

/* renamed from: X.1LF  reason: invalid class name */
public final class AnonymousClass1LF {
    public final Conversation A00;
    public final AnonymousClass0IY A01;
    public final boolean A02;

    public AnonymousClass1LF(Conversation conversation, boolean z, AnonymousClass0IY r3) {
        this.A00 = conversation;
        this.A02 = z;
        this.A01 = r3;
    }

    public Conversation A00() {
        if (this.A02) {
            return this.A00;
        }
        throw new AssertionError("no active session");
    }

    public boolean A01(AnonymousClass02N r3) {
        return this.A02 && C006803i.A0q(this.A00.A14, r3) && !this.A01.A00;
    }
}
