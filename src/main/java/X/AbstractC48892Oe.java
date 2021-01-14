package X;

import android.database.ContentObserver;
import java.util.HashMap;

/* renamed from: X.2Oe  reason: invalid class name and case insensitive filesystem */
public interface AbstractC48892Oe {
    HashMap A4z();

    AbstractC48882Od A7I(int i);

    void AMq();

    void close();

    int getCount();

    boolean isEmpty();

    void registerContentObserver(ContentObserver contentObserver);

    void unregisterContentObserver(ContentObserver contentObserver);
}
