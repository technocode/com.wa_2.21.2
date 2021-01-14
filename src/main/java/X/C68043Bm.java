package X;

import java.security.InvalidKeyException;

/* renamed from: X.3Bm  reason: invalid class name and case insensitive filesystem */
public class C68043Bm extends InvalidKeyException {
    public final /* synthetic */ C73353Wz this$0;
    public final /* synthetic */ Exception val$e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68043Bm(C73353Wz r1, String str, Exception exc) {
        super(str);
        this.this$0 = r1;
        this.val$e = exc;
    }

    public Throwable getCause() {
        return this.val$e;
    }
}
