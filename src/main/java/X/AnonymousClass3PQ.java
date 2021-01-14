package X;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.3PQ  reason: invalid class name */
public class AnonymousClass3PQ implements AnonymousClass0XW {
    public int A00 = -1;
    public StatusPlaybackFragment A01 = null;
    public boolean A02 = false;
    public final Rect A03 = new Rect();
    public final Rect A04 = new Rect();
    public final /* synthetic */ StatusPlaybackActivity A05;

    public AnonymousClass3PQ(StatusPlaybackActivity statusPlaybackActivity) {
        this.A05 = statusPlaybackActivity;
    }

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
        char c;
        StatusPlaybackActivity statusPlaybackActivity = this.A05;
        if (i == 0) {
            statusPlaybackActivity.A0E = false;
            this.A00 = -1;
            this.A02 = false;
            this.A01 = null;
            Iterator it = ((AbstractCollection) statusPlaybackActivity.A0D()).iterator();
            while (it.hasNext()) {
                AnonymousClass037 r1 = (AnonymousClass037) it.next();
                if (r1 instanceof StatusPlaybackFragment) {
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) r1;
                    if (!statusPlaybackFragment.A00) {
                        C659832i.A00(((StatusPlaybackContactFragment) statusPlaybackFragment).A0w(), 0);
                    }
                }
            }
            this.A02 = false;
            Runnable runnable = statusPlaybackActivity.A0B;
            if (runnable != null) {
                runnable.run();
                statusPlaybackActivity.A0B = null;
            }
        } else if (!statusPlaybackActivity.A0E) {
            statusPlaybackActivity.A0E = true;
            this.A00 = statusPlaybackActivity.A07.getCurrentItem();
        }
        if (i == 0) {
            c = 0;
        } else if (i == 1) {
            c = 1;
        } else if (i == 2) {
            c = 2;
        } else {
            throw new IllegalStateException("Invalid scrollState value from ViewPager");
        }
        Iterator it2 = ((AbstractCollection) statusPlaybackActivity.A0D()).iterator();
        while (it2.hasNext()) {
            AnonymousClass037 r12 = (AnonymousClass037) it2.next();
            if (r12 instanceof StatusPlaybackFragment) {
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) ((StatusPlaybackFragment) r12);
                if (statusPlaybackBaseFragment == null) {
                    throw null;
                } else if (c == 0) {
                    statusPlaybackBaseFragment.A0v(false);
                } else if (c == 1 || c == 2) {
                    statusPlaybackBaseFragment.A0v(true);
                }
            }
        }
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
        View view;
        StatusPlaybackActivity statusPlaybackActivity;
        ViewPager viewPager;
        if (!Float.isNaN(f) && f != 0.0f && f != 1.0f) {
            boolean z = false;
            if (i == this.A00) {
                z = true;
            }
            if (!this.A02) {
                StatusPlaybackFragment statusPlaybackFragment = this.A01;
                if (statusPlaybackFragment == null) {
                    StatusPlaybackActivity statusPlaybackActivity2 = this.A05;
                    if (z) {
                        i++;
                    }
                    statusPlaybackFragment = statusPlaybackActivity2.A0T(i);
                    this.A01 = statusPlaybackFragment;
                }
                if (statusPlaybackFragment != null && !statusPlaybackFragment.A00 && (view = statusPlaybackFragment.A0A) != null && (viewPager = (statusPlaybackActivity = this.A05).A07) != null && viewPager.isShown() && view.isShown()) {
                    Rect rect = this.A04;
                    viewPager.getGlobalVisibleRect(rect);
                    Rect rect2 = this.A03;
                    view.getGlobalVisibleRect(rect2);
                    if (rect.intersect(rect2)) {
                        StatusPlaybackFragment statusPlaybackFragment2 = this.A01;
                        int i3 = statusPlaybackActivity.A02;
                        if (i3 != 0) {
                            statusPlaybackActivity.A02 = 0;
                        } else {
                            i3 = 2;
                            if (z) {
                                i3 = 3;
                            }
                        }
                        statusPlaybackFragment2.A0r(i3);
                        this.A02 = true;
                    }
                }
            }
        }
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        boolean z;
        StatusPlaybackActivity statusPlaybackActivity = this.A05;
        if (i != statusPlaybackActivity.A01) {
            statusPlaybackActivity.A0C = false;
            AnonymousClass3PP r5 = (AnonymousClass3PP) statusPlaybackActivity.A09.A00.get(i);
            if (r5 != null) {
                Iterator it = ((AbstractCollection) statusPlaybackActivity.A0D()).iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass037 r4 = (AnonymousClass037) it.next();
                    if (r4 instanceof StatusPlaybackFragment) {
                        StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) r4;
                        if (!r5.A00.A0A.getRawString().equals(statusPlaybackFragment.A0n()) && statusPlaybackFragment.A00) {
                            if (i <= statusPlaybackActivity.A01) {
                                z = false;
                            }
                            int i2 = statusPlaybackActivity.A03;
                            if (i2 != 0) {
                                statusPlaybackActivity.A03 = 0;
                            } else {
                                i2 = 6;
                                if (z) {
                                    i2 = 7;
                                }
                            }
                            C659832i.A00(((StatusPlaybackContactFragment) statusPlaybackFragment).A0w(), i2);
                            statusPlaybackFragment.A0q();
                        }
                    }
                }
                StatusPlaybackFragment A0U = statusPlaybackActivity.A0U(r5);
                if (A0U != null && !A0U.A00) {
                    A0U.A0p();
                    if (i <= statusPlaybackActivity.A01) {
                        z = false;
                    }
                    int i3 = statusPlaybackActivity.A02;
                    if (i3 != 0) {
                        statusPlaybackActivity.A02 = 0;
                    } else {
                        i3 = 2;
                        if (z) {
                            i3 = 3;
                        }
                    }
                    A0U.A0r(i3);
                }
            }
            statusPlaybackActivity.A01 = i;
        }
    }
}
