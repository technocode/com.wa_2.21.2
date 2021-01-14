package X;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.MentionPickerView;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.companiondevice.LinkedDevicesActivity;

/* renamed from: X.0pb  reason: invalid class name and case insensitive filesystem */
public class C16310pb extends Observable {
    public void A00() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            AbstractC16320pc r1 = (AbstractC16320pc) ((Observable) this).mObservers.get(size);
            if (r1 instanceof C54232eZ) {
                ((C54232eZ) r1).A00.requestLayout();
            } else if (r1 instanceof AnonymousClass2XY) {
                LinkedDevicesActivity linkedDevicesActivity = ((AnonymousClass2XY) r1).A00;
                linkedDevicesActivity.A08.A02.post(new RunnableEBaseShape8S0100000_I1_3(linkedDevicesActivity, 31));
            } else if (r1 instanceof C40881tz) {
                ((C40881tz) r1).A00.A01.A00();
            } else if (r1 instanceof C40861tx) {
                StickyHeadersRecyclerView stickyHeadersRecyclerView = ((C40861tx) r1).A00;
                stickyHeadersRecyclerView.A02 = -1;
                stickyHeadersRecyclerView.A00 = -1;
            } else if (r1 instanceof C40291sx) {
                MentionPickerView mentionPickerView = ((C40291sx) r1).A00;
                mentionPickerView.A02(mentionPickerView.A02.A05(), mentionPickerView.getResources().getDimensionPixelSize(R.dimen.mention_picker_row_height));
            } else if (r1 instanceof C30611bd) {
                RecyclerView recyclerView = ((C30611bd) r1).A00;
                recyclerView.A0r(null);
                recyclerView.A0z.A0D = true;
                recyclerView.A0t(true);
                boolean z = false;
                if (recyclerView.A0J.A04.size() > 0) {
                    z = true;
                }
                if (!z) {
                    recyclerView.requestLayout();
                }
            }
        }
    }

    public void A01(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            AbstractC16320pc r7 = (AbstractC16320pc) ((Observable) this).mObservers.get(size);
            if (r7 instanceof C40831tu) {
                C40841tv r0 = ((C40831tu) r7).A00;
                C40841tv.A00(r0, i, 1);
                C40841tv.A00(r0, i2, 1);
            } else if (r7 instanceof C30611bd) {
                C30611bd r72 = (C30611bd) r7;
                RecyclerView recyclerView = r72.A00;
                recyclerView.A0r(null);
                C30391bH r4 = recyclerView.A0J;
                if (r4 == null) {
                    throw null;
                } else if (i == i2) {
                    continue;
                } else if (1 == 1) {
                    r4.A04.add(r4.A02(8, i, i2, null));
                    r4.A00 |= 8;
                    if (r4.A04.size() == 1) {
                        r72.A01();
                    }
                } else {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            } else {
                continue;
            }
        }
    }

    public void A02(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC16320pc) ((Observable) this).mObservers.get(size)).A00(i, i2);
        }
    }

    public void A03(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            AbstractC16320pc r5 = (AbstractC16320pc) ((Observable) this).mObservers.get(size);
            if (r5 instanceof C40831tu) {
                C40841tv.A00(((C40831tu) r5).A00, i, i2);
            } else if (r5 instanceof C30611bd) {
                C30611bd r52 = (C30611bd) r5;
                RecyclerView recyclerView = r52.A00;
                recyclerView.A0r(null);
                C30391bH r4 = recyclerView.A0J;
                if (r4 == null) {
                    throw null;
                } else if (i2 >= 1) {
                    r4.A04.add(r4.A02(2, i, i2, null));
                    r4.A00 |= 2;
                    if (r4.A04.size() == 1) {
                        r52.A01();
                    }
                }
            } else {
                continue;
            }
        }
    }

    public void A04(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            AbstractC16320pc r6 = (AbstractC16320pc) ((Observable) this).mObservers.get(size);
            if (r6 instanceof C30611bd) {
                C30611bd r62 = (C30611bd) r6;
                RecyclerView recyclerView = r62.A00;
                recyclerView.A0r(null);
                C30391bH r4 = recyclerView.A0J;
                if (r4 == null) {
                    throw null;
                } else if (i2 >= 1) {
                    r4.A04.add(r4.A02(4, i, i2, obj));
                    r4.A00 |= 4;
                    if (r4.A04.size() == 1) {
                        r62.A01();
                    }
                }
            } else if (r6 instanceof C40831tu) {
                C40841tv.A00(((C40831tu) r6).A00, i, i2);
            }
        }
    }

    public boolean A05() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
