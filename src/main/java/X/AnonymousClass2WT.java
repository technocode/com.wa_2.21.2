package X;

import android.database.ContentObserver;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2WT  reason: invalid class name */
public class AnonymousClass2WT implements AbstractC48892Oe {
    public final AbstractC48892Oe A00;
    public final List A01;

    public AnonymousClass2WT(AbstractC48892Oe r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    @Override // X.AbstractC48892Oe
    public HashMap A4z() {
        return this.A00.A4z();
    }

    @Override // X.AbstractC48892Oe
    public AbstractC48882Od A7I(int i) {
        List list = this.A01;
        if (i < list.size()) {
            return (AbstractC48882Od) list.get(i);
        }
        return this.A00.A7I(i - list.size());
    }

    @Override // X.AbstractC48892Oe
    public void AMq() {
        this.A00.AMq();
    }

    @Override // X.AbstractC48892Oe
    public void close() {
        this.A00.close();
    }

    @Override // X.AbstractC48892Oe
    public int getCount() {
        return this.A01.size() + this.A00.getCount();
    }

    @Override // X.AbstractC48892Oe
    public boolean isEmpty() {
        return this.A00.isEmpty() && this.A01.isEmpty();
    }

    @Override // X.AbstractC48892Oe
    public void registerContentObserver(ContentObserver contentObserver) {
        this.A00.registerContentObserver(contentObserver);
    }

    @Override // X.AbstractC48892Oe
    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.A00.unregisterContentObserver(contentObserver);
    }
}
