package com.whatsapp.notification;

import X.AnonymousClass0YE;
import X.C08440b7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class PopupNotificationViewPager extends ViewPager {
    public Integer A00 = null;
    public boolean A01 = true;

    public PopupNotificationViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void A0B(int i, boolean z) {
        A0O(i, z, !z);
    }

    public void A0O(int i, boolean z, boolean z2) {
        int i2;
        int currentOffsetBlocks;
        if (this.A0V.A01() > 0) {
            AnonymousClass0YE r1 = this.A0V;
            if (r1 instanceof C08440b7) {
                int A012 = ((C08440b7) r1).A00.A01();
                if (i < 0) {
                    i2 = -1;
                    while (i < 0) {
                        i += A012;
                    }
                } else {
                    i2 = 0;
                    if (i >= A012) {
                        i2 = 1;
                    }
                }
                int i3 = i % A012;
                if (z2) {
                    currentOffsetBlocks = getDefaultOffsetBlocks();
                } else {
                    currentOffsetBlocks = getCurrentOffsetBlocks() + i2;
                    int A013 = this.A0V.A01() / ((C08440b7) this.A0V).A00.A01();
                    if (currentOffsetBlocks < 0 || currentOffsetBlocks >= A013) {
                        currentOffsetBlocks = getDefaultOffsetBlocks();
                        z = false;
                    }
                }
                i = i3 + (currentOffsetBlocks * A012);
            }
        }
        super.A0B(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        if (this.A0V.A01() <= 0 || !(this.A0V instanceof C08440b7)) {
            return super.getCurrentItem();
        }
        return super.getCurrentItem() % ((C08440b7) this.A0V).A00.A01();
    }

    private int getCurrentOffsetBlocks() {
        if (this.A0V.A01() <= 0 || !(this.A0V instanceof C08440b7)) {
            return 0;
        }
        return super.getCurrentItem() / ((C08440b7) this.A0V).A00.A01();
    }

    private int getDefaultOffsetBlocks() {
        if (this.A0V.A01() <= 0 || !(this.A0V instanceof C08440b7)) {
            return 0;
        }
        return SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onAttachedToWindow() {
        this.A01 = true;
        super.onAttachedToWindow();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0YE r1 = this.A0V;
        if (!(r1 instanceof C08440b7) || ((C08440b7) r1).A00.A01() > 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        super.onLayout(z, i, i2, i3, i4);
        this.A01 = false;
        if (0 == 0 && (num = this.A00) != null) {
            A0O(num.intValue(), true, false);
            this.A00 = null;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0YE r1 = this.A0V;
        if (!(r1 instanceof C08440b7) || ((C08440b7) r1).A00.A01() > 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(AnonymousClass0YE r2) {
        this.A01 = true;
        super.setAdapter(r2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        A0O(i, false, true);
    }
}
