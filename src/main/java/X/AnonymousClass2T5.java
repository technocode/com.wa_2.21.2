package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.2T5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2T5 implements Comparator {
    public static final /* synthetic */ AnonymousClass2T5 A00 = new AnonymousClass2T5();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((File) ((AnonymousClass2T8) obj).A01.get(0)).getName().compareTo(((File) ((AnonymousClass2T8) obj2).A01.get(0)).getName());
    }
}
