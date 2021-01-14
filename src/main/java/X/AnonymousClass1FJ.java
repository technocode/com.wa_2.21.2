package X;

import java.io.IOException;

/* renamed from: X.1FJ  reason: invalid class name */
public class AnonymousClass1FJ extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public AnonymousClass1FJ(String str, Throwable th) {
        super(AnonymousClass008.A0K("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public AnonymousClass1FJ(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
