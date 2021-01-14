package X;

import com.google.android.search.verification.client.R;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: X.1TJ  reason: invalid class name */
public final class AnonymousClass1TJ extends Enum {
    public static final /* synthetic */ AnonymousClass1TJ[] A00;
    public static final AnonymousClass1TJ A01;
    public final int contentDescription = R.string.more;
    public final int drawable = R.drawable.ic_switch_to_grid;

    static {
        AnonymousClass1TJ r1 = new AnonymousClass1TJ();
        A01 = r1;
        A00 = new AnonymousClass1TJ[]{r1};
    }

    public static AnonymousClass1TJ valueOf(String str) {
        return (AnonymousClass1TJ) Enum.valueOf(AnonymousClass1TJ.class, str);
    }

    public static AnonymousClass1TJ[] values() {
        return (AnonymousClass1TJ[]) A00.clone();
    }
}
