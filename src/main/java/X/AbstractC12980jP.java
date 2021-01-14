package X;

import android.content.Context;
import android.view.MenuItem;
import java.util.Map;

/* renamed from: X.0jP  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC12980jP {
    public Map A00;
    public final Context A01;

    public AbstractC12980jP(Context context) {
        this.A01 = context;
    }

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC07630Yu)) {
            return menuItem;
        }
        AbstractMenuItemC07630Yu r1 = (AbstractMenuItemC07630Yu) menuItem;
        Map map = this.A00;
        if (map == null) {
            map = new AnonymousClass05V();
            this.A00 = map;
        }
        MenuItem menuItem2 = (MenuItem) map.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        AnonymousClass1ZW r3 = new AnonymousClass1ZW(this.A01, r1);
        this.A00.put(r1, r3);
        return r3;
    }
}
