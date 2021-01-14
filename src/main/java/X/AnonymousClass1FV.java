package X;

import java.util.List;

/* renamed from: X.1FV  reason: invalid class name */
public class AnonymousClass1FV extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List missingFields = null;

    public AnonymousClass1FV() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
