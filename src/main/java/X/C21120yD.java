package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0yD  reason: invalid class name and case insensitive filesystem */
public class C21120yD {
    public volatile List A00 = Collections.unmodifiableList(new ArrayList());

    public synchronized void A00() {
        this.A00 = Collections.unmodifiableList(new ArrayList());
    }

    public synchronized boolean A01(Object obj) {
        if (this.A00.contains(obj)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(this.A00.size() + 1);
        arrayList.addAll(this.A00);
        arrayList.add(obj);
        this.A00 = Collections.unmodifiableList(arrayList);
        return true;
    }

    public synchronized boolean A02(Object obj) {
        if (!this.A00.contains(obj)) {
            return false;
        }
        int size = this.A00.size();
        int i = size - 1;
        ArrayList arrayList = new ArrayList(i);
        int indexOf = this.A00.indexOf(obj);
        if (indexOf > 0) {
            arrayList.addAll(this.A00.subList(0, indexOf));
        }
        if (indexOf < i) {
            arrayList.addAll(this.A00.subList(indexOf + 1, size));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
        return true;
    }
}
