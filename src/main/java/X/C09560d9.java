package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import com.whatsapp.HomeActivity;
import com.whatsapp.collections.observablelistview.ObservableListView;

/* renamed from: X.0d9  reason: invalid class name and case insensitive filesystem */
public class C09560d9 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ObservableListView A00;

    public C09560d9(ObservableListView observableListView) {
        this.A00 = observableListView;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int height;
        int height2;
        ObservableListView observableListView = this.A00;
        AbsListView.OnScrollListener onScrollListener = observableListView.A08;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
        if (observableListView.A09 != null && observableListView.getChildCount() > 0) {
            int firstVisiblePosition = observableListView.getFirstVisiblePosition();
            int firstVisiblePosition2 = observableListView.getFirstVisiblePosition();
            int i4 = 0;
            while (firstVisiblePosition2 <= observableListView.getLastVisiblePosition()) {
                if (observableListView.A05.indexOfKey(firstVisiblePosition2) < 0 || observableListView.getChildAt(i4).getHeight() != observableListView.A05.get(firstVisiblePosition2)) {
                    observableListView.A05.put(firstVisiblePosition2, observableListView.getChildAt(i4).getHeight());
                }
                firstVisiblePosition2++;
                i4++;
            }
            View childAt = observableListView.getChildAt(0);
            if (childAt != null) {
                int i5 = observableListView.A01;
                boolean z = true;
                if (i5 < firstVisiblePosition) {
                    int i6 = 0;
                    if (firstVisiblePosition - i5 != 1) {
                        for (int i7 = firstVisiblePosition - 1; i7 > observableListView.A01; i7--) {
                            if (observableListView.A05.indexOfKey(i7) > 0) {
                                height2 = observableListView.A05.get(i7);
                            } else {
                                height2 = childAt.getHeight();
                            }
                            i6 += height2;
                        }
                    }
                    observableListView.A03 = observableListView.A00 + i6 + observableListView.A03;
                    observableListView.A00 = childAt.getHeight();
                } else if (firstVisiblePosition < i5) {
                    int i8 = 0;
                    if (i5 - firstVisiblePosition != 1) {
                        for (int i9 = i5 - 1; i9 > firstVisiblePosition; i9--) {
                            if (observableListView.A05.indexOfKey(i9) > 0) {
                                height = observableListView.A05.get(i9);
                            } else {
                                height = childAt.getHeight();
                            }
                            i8 += height;
                        }
                    }
                    observableListView.A03 -= childAt.getHeight() + i8;
                    observableListView.A00 = childAt.getHeight();
                } else if (firstVisiblePosition == 0) {
                    observableListView.A00 = childAt.getHeight();
                }
                if (observableListView.A00 < 0) {
                    observableListView.A00 = 0;
                }
                int top = observableListView.A03 - childAt.getTop();
                observableListView.A04 = top;
                observableListView.A01 = firstVisiblePosition;
                AbstractC07300Wx r4 = observableListView.A09;
                boolean z2 = observableListView.A0E;
                boolean z3 = observableListView.A0D;
                HomeActivity homeActivity = (HomeActivity) r4;
                if (observableListView == homeActivity.A0b()) {
                    if (homeActivity.A0r()) {
                        View currentFocus = homeActivity.getCurrentFocus();
                        InputMethodManager A0H = homeActivity.A0v.A0H();
                        if (!z2 && z3) {
                            if (!(currentFocus == null || A0H == null)) {
                                A0H.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                            }
                            if (homeActivity.A0q() && homeActivity.A04().A0Q.A01("search_fragment") != null) {
                                homeActivity.A0l(true);
                            }
                        }
                    } else {
                        int height3 = homeActivity.A0I.getHeight();
                        if (homeActivity.A02 >= top) {
                            z = false;
                        }
                        homeActivity.A02 = top;
                        if (z2 || homeActivity.A0W != z) {
                            homeActivity.A0W = z;
                            homeActivity.A00 = homeActivity.A01 + top;
                            homeActivity.A09.animate().cancel();
                            homeActivity.A09.setTranslationY((float) homeActivity.A01);
                        }
                        int max = Math.max(-height3, Math.min(-(top - homeActivity.A00), 0));
                        if (max != homeActivity.A01) {
                            homeActivity.A01 = max;
                            homeActivity.A09.animate().cancel();
                            homeActivity.A09.setTranslationY((float) homeActivity.A01);
                        }
                    }
                }
                if (observableListView.A0E) {
                    observableListView.A0E = false;
                }
                int i10 = observableListView.A02;
                int i11 = observableListView.A04;
                if (i10 < i11) {
                    observableListView.A0B = EnumC12590iL.UP;
                } else if (i11 < i10) {
                    observableListView.A0B = EnumC12590iL.DOWN;
                } else {
                    observableListView.A0B = EnumC12590iL.STOP;
                }
                observableListView.A02 = i11;
            }
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ObservableListView A0b;
        ObservableListView observableListView = this.A00;
        AbsListView.OnScrollListener onScrollListener = observableListView.A08;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
        AbstractC07300Wx r4 = observableListView.A09;
        if (r4 != null && i == 0) {
            HomeActivity homeActivity = (HomeActivity) r4;
            if (observableListView != homeActivity.A0b()) {
                return;
            }
            if ((-homeActivity.A01) <= (homeActivity.A0I.getHeight() >> 1) || ((A0b = homeActivity.A0b()) != null && A0b.A04 < homeActivity.A0I.getHeight())) {
                homeActivity.A0d();
                return;
            }
            int i2 = -homeActivity.A0I.getHeight();
            float f = (float) i2;
            if (homeActivity.A09.getTranslationY() != f) {
                homeActivity.A09.animate().cancel();
                homeActivity.A09.animate().translationY(f).setDuration(250).start();
                homeActivity.A01 = i2;
            }
            homeActivity.A0m(false);
        }
    }
}
