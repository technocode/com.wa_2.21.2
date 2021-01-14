package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.0V8  reason: invalid class name */
public class AnonymousClass0V8 implements AbstractC06100Rs {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final AnonymousClass05W A02 = new AnonymousClass05W();
    public final ArrayList A03 = new ArrayList();

    public AnonymousClass0V8(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }

    public ActionMode A00(AbstractC06110Rt r6) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C12920jJ r1 = (C12920jJ) arrayList.get(i);
            if (r1 != null && r1.A01 == r6) {
                return r1;
            }
        }
        C12920jJ r0 = new C12920jJ(this.A00, r6);
        arrayList.add(r0);
        return r0;
    }

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r5, MenuItem menuItem) {
        return this.A01.onActionItemClicked(A00(r5), new AnonymousClass1ZW(this.A00, (AbstractMenuItemC07630Yu) menuItem));
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r7, Menu menu) {
        ActionMode.Callback callback = this.A01;
        ActionMode A002 = A00(r7);
        AnonymousClass05W r3 = this.A02;
        Menu menu2 = (Menu) r3.getOrDefault(menu, null);
        if (menu2 == null) {
            menu2 = new AnonymousClass1ZY(this.A00, (AnonymousClass0T9) menu);
            r3.put(menu, menu2);
        }
        return callback.onCreateActionMode(A002, menu2);
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r3) {
        this.A01.onDestroyActionMode(A00(r3));
    }

    @Override // X.AbstractC06100Rs
    public boolean AIh(AbstractC06110Rt r7, Menu menu) {
        ActionMode.Callback callback = this.A01;
        ActionMode A002 = A00(r7);
        AnonymousClass05W r3 = this.A02;
        Menu menu2 = (Menu) r3.getOrDefault(menu, null);
        if (menu2 == null) {
            menu2 = new AnonymousClass1ZY(this.A00, (AnonymousClass0T9) menu);
            r3.put(menu, menu2);
        }
        return callback.onPrepareActionMode(A002, menu2);
    }
}
