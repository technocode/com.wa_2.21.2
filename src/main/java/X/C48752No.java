package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2No  reason: invalid class name and case insensitive filesystem */
public final class C48752No extends Exception {
    public static final long serialVersionUID = 3026362227162912146L;
    public final String message;
    public final List throwables;

    public C48752No(List list) {
        this.throwables = Collections.unmodifiableList(new ArrayList(list));
        StringBuilder sb = new StringBuilder();
        sb.append(list.size());
        sb.append(" exceptions occurred: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((Throwable) it.next()).getMessage());
            sb.append(";");
        }
        this.message = sb.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
