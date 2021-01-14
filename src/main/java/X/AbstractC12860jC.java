package X;

/* renamed from: X.0jC  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC12860jC {
    public void A00() {
        if (this instanceof AnonymousClass1ZJ) {
            ((AnonymousClass1ZJ) this).A00.start();
        } else if (!(this instanceof AnonymousClass1ZI)) {
            ((AnonymousClass1ZH) this).A00.start();
        } else {
            ((AnonymousClass1ZI) this).A00.start();
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass1ZJ) {
            ((AnonymousClass1ZJ) this).A00.cancel();
        } else if (!(this instanceof AnonymousClass1ZI)) {
            ((AnonymousClass1ZH) this).A00.stop();
        } else {
            ((AnonymousClass1ZI) this).A00.stop();
        }
    }
}
