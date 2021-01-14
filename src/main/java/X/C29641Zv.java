package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.1Zv  reason: invalid class name and case insensitive filesystem */
public class C29641Zv extends C13290jy {
    public MenuItem A00;
    public AbstractC13340k5 A01;
    public final int A02;
    public final int A03;

    public C29641Zv(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.A02 = 22;
            this.A03 = 21;
            return;
        }
        this.A02 = 21;
        this.A03 = 22;
    }

    @Override // X.C13290jy
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        C13020jT r4;
        int pointToPosition;
        int i2;
        if (this.A01 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                r4 = (C13020jT) headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
                r4 = (C13020jT) adapter;
            }
            AnonymousClass1ZT r3 = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < r4.getCount()) {
                r3 = r4.getItem(i2);
            }
            MenuItem menuItem = this.A00;
            if (menuItem != r3) {
                AnonymousClass0T8 r1 = r4.A01;
                if (menuItem != null) {
                    this.A01.AGs(r1, menuItem);
                }
                this.A00 = r3;
                if (r3 != null) {
                    this.A01.AGr(r1, r3);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i == this.A03) {
                setSelection(-1);
                ((C13020jT) getAdapter()).A01.A0F(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(AbstractC13340k5 r1) {
        this.A01 = r1;
    }
}
