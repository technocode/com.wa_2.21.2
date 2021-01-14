package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1bT  reason: invalid class name and case insensitive filesystem */
public class C30511bT extends AbstractC16380pi implements AbstractC16420pm {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08 = 0;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B;
    public int A0C;
    public long A0D;
    public Rect A0E;
    public VelocityTracker A0F;
    public View A0G = null;
    public C14890n3 A0H;
    public AbstractC16160pM A0I;
    public C16170pN A0J;
    public AbstractC16330pd A0K = null;
    public AbstractC11910hD A0L = null;
    public RecyclerView A0M;
    public List A0N;
    public List A0O = new ArrayList();
    public List A0P;
    public final AbstractC16440po A0Q = new C30481bQ(this);
    public final Runnable A0R = new RunnableEBaseShape5S0100000_I1_0(this, 15);
    public final List A0S = new ArrayList();
    public final float[] A0T = new float[2];

    @Override // X.AbstractC16420pm
    public void AE4(View view) {
    }

    public C30511bT(AbstractC16160pM r5) {
        this.A0I = r5;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r4) {
        rect.setEmpty();
    }

    public final int A01(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 4;
        int i3 = 4;
        if (this.A00 > 0.0f) {
            i3 = 8;
        }
        VelocityTracker velocityTracker = this.A0F;
        if (velocityTracker != null && this.A09 > -1) {
            AbstractC16160pM r1 = this.A0I;
            float f = this.A04;
            if (r1 != null) {
                velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, f);
                float xVelocity = this.A0F.getXVelocity(this.A09);
                float yVelocity = this.A0F.getYVelocity(this.A09);
                if (xVelocity > 0.0f) {
                    i2 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2) {
                    AbstractC16160pM r12 = this.A0I;
                    float f2 = this.A07;
                    if (r12 == null) {
                        throw null;
                    } else if (abs >= f2 && abs > Math.abs(yVelocity)) {
                        return i2;
                    }
                }
            } else {
                throw null;
            }
        }
        float width = (float) this.A0M.getWidth();
        if (this.A0I != null) {
            float f3 = width * 0.5f;
            if ((i & i3) == 0 || Math.abs(this.A00) <= f3) {
                return 0;
            }
            return i3;
        }
        throw null;
    }

    public final int A02(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 1;
        int i3 = 1;
        if (this.A01 > 0.0f) {
            i3 = 2;
        }
        VelocityTracker velocityTracker = this.A0F;
        if (velocityTracker != null && this.A09 > -1) {
            AbstractC16160pM r1 = this.A0I;
            float f = this.A04;
            if (r1 != null) {
                velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, f);
                float xVelocity = this.A0F.getXVelocity(this.A09);
                float yVelocity = this.A0F.getYVelocity(this.A09);
                if (yVelocity > 0.0f) {
                    i2 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3) {
                    AbstractC16160pM r12 = this.A0I;
                    float f2 = this.A07;
                    if (r12 == null) {
                        throw null;
                    } else if (abs >= f2 && abs > Math.abs(xVelocity)) {
                        return i2;
                    }
                }
            } else {
                throw null;
            }
        }
        float height = (float) this.A0M.getHeight();
        if (this.A0I != null) {
            float f3 = height * 0.5f;
            if ((i & i3) == 0 || Math.abs(this.A01) <= f3) {
                return 0;
            }
            return i3;
        }
        throw null;
    }

    public View A03(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC11910hD r0 = this.A0L;
        if (r0 != null) {
            View view = r0.A0H;
            float f = this.A05 + this.A00;
            float f2 = this.A06 + this.A01;
            if (x >= f && x <= f + ((float) view.getWidth()) && y >= f2 && y <= f2 + ((float) view.getHeight())) {
                return view;
            }
        }
        for (int size = this.A0O.size() - 1; size >= 0; size--) {
            C16190pP r1 = (C16190pP) this.A0O.get(size);
            View view2 = r1.A0C.A0H;
            float f3 = r1.A01;
            float f4 = r1.A02;
            if (x >= f3 && x <= f3 + ((float) view2.getWidth()) && y >= f4 && y <= f4 + ((float) view2.getHeight())) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.A0M;
        int A002 = recyclerView.A0K.A00();
        while (true) {
            A002--;
            if (A002 < 0) {
                return null;
            }
            View A032 = recyclerView.A0K.A03(A002);
            float translationX = A032.getTranslationX();
            float translationY = A032.getTranslationY();
            if (x >= ((float) A032.getLeft()) + translationX && x <= ((float) A032.getRight()) + translationX && y >= ((float) A032.getTop()) + translationY && y <= ((float) A032.getBottom()) + translationY) {
                return A032;
            }
        }
    }

    public void A04(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.A02;
        this.A00 = f;
        float f2 = y - this.A03;
        this.A01 = f2;
        float f3 = f2;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.A00 = f;
        }
        if ((i & 8) == 0) {
            this.A00 = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            f3 = Math.max(0.0f, f2);
            this.A01 = f3;
        }
        if ((i & 2) == 0) {
            this.A01 = Math.min(0.0f, f3);
        }
    }

    public void A05(View view) {
        if (view == this.A0G) {
            this.A0G = null;
            if (this.A0K != null) {
                this.A0M.setChildDrawingOrderCallback(null);
            }
        }
    }

    public void A06(AbstractC11910hD r21) {
        int left;
        int abs;
        int bottom;
        int abs2;
        int abs3;
        int right;
        int abs4;
        if (this.A0M.isLayoutRequested() || this.A08 != 2) {
            return;
        }
        if (this.A0I != null) {
            int i = (int) (this.A05 + this.A00);
            int i2 = (int) (this.A06 + this.A01);
            View view = r21.A0H;
            if (((float) Math.abs(i2 - view.getTop())) >= ((float) view.getHeight()) * 0.5f || ((float) Math.abs(i - view.getLeft())) >= ((float) view.getWidth()) * 0.5f) {
                List list = this.A0P;
                if (list == null) {
                    this.A0P = new ArrayList();
                    this.A0N = new ArrayList();
                } else {
                    list.clear();
                    this.A0N.clear();
                }
                if (this.A0I != null) {
                    int round = Math.round(this.A05 + this.A00) - 0;
                    int round2 = Math.round(this.A06 + this.A01) - 0;
                    int width = view.getWidth() + round + 0;
                    int height = view.getHeight() + round2 + 0;
                    int i3 = (round + width) / 2;
                    int i4 = (round2 + height) / 2;
                    AnonymousClass0VT r0 = this.A0M.A0S;
                    int A0A2 = r0.A0A();
                    for (int i5 = 0; i5 < A0A2; i5++) {
                        View A0I2 = r0.A0I(i5);
                        if (A0I2 != view && A0I2.getBottom() >= round2 && A0I2.getTop() <= height && A0I2.getRight() >= round && A0I2.getLeft() <= width) {
                            AbstractC11910hD A0E2 = this.A0M.A0E(A0I2);
                            if (this.A0I != null) {
                                int abs5 = Math.abs(i3 - ((A0I2.getRight() + A0I2.getLeft()) >> 1));
                                int abs6 = Math.abs(i4 - ((A0I2.getBottom() + A0I2.getTop()) / 2));
                                int i6 = (abs6 * abs6) + (abs5 * abs5);
                                int size = this.A0P.size();
                                int i7 = 0;
                                int i8 = 0;
                                while (i7 < size && i6 > ((Number) this.A0N.get(i7)).intValue()) {
                                    i8++;
                                    i7++;
                                }
                                this.A0P.add(i8, A0E2);
                                this.A0N.add(i8, Integer.valueOf(i6));
                            } else {
                                throw null;
                            }
                        }
                    }
                    List list2 = this.A0P;
                    if (list2.size() != 0) {
                        if (this.A0I != null) {
                            int width2 = view.getWidth() + i;
                            int height2 = view.getHeight() + i2;
                            int left2 = i - view.getLeft();
                            int top = i2 - view.getTop();
                            int size2 = list2.size();
                            AbstractC11910hD r6 = null;
                            int i9 = -1;
                            for (int i10 = 0; i10 < size2; i10++) {
                                AbstractC11910hD r5 = (AbstractC11910hD) list2.get(i10);
                                if (left2 <= 0 || (right = r5.A0H.getRight() - width2) >= 0) {
                                    if (left2 < 0 && (left = r5.A0H.getLeft() - i) > 0 && r5.A0H.getLeft() < view.getLeft() && (abs = Math.abs(left)) > i9) {
                                        i9 = abs;
                                        r6 = r5;
                                    }
                                } else if (r5.A0H.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i9) {
                                    i9 = abs4;
                                    r6 = r5;
                                }
                                if (top < 0) {
                                    int top2 = r5.A0H.getTop() - i2;
                                    if (top2 > 0 && r5.A0H.getTop() < view.getTop() && (abs3 = Math.abs(top2)) > i9) {
                                        i9 = abs3;
                                        r6 = r5;
                                    }
                                } else if (top > 0 && (bottom = r5.A0H.getBottom() - height2) < 0 && r5.A0H.getBottom() > view.getBottom() && (abs2 = Math.abs(bottom)) > i9) {
                                    i9 = abs2;
                                    r6 = r5;
                                }
                            }
                            if (r6 == null) {
                                this.A0P.clear();
                                this.A0N.clear();
                                return;
                            }
                            int A002 = r6.A00();
                            r21.A00();
                            C71743Qd r02 = (C71743Qd) this.A0I;
                            if (r02 != null) {
                                int A003 = r21.A00();
                                int A004 = r6.A00();
                                StickerStoreMyTabFragment stickerStoreMyTabFragment = r02.A00;
                                if (A004 < ((StickerStoreTabFragment) stickerStoreMyTabFragment).A06.size() && A004 >= 0 && A003 < ((StickerStoreTabFragment) stickerStoreMyTabFragment).A06.size() && A003 >= 0) {
                                    int i11 = A003;
                                    if (A003 < A004) {
                                        while (i11 < A004) {
                                            int i12 = i11 + 1;
                                            Collections.swap(((StickerStoreTabFragment) stickerStoreMyTabFragment).A06, i11, i12);
                                            i11 = i12;
                                        }
                                    } else {
                                        while (i11 > A004) {
                                            int i13 = i11 - 1;
                                            Collections.swap(((StickerStoreTabFragment) stickerStoreMyTabFragment).A06, i11, i13);
                                            i11 = i13;
                                        }
                                    }
                                    stickerStoreMyTabFragment.A03 = true;
                                    ((AbstractC16300pa) ((StickerStoreTabFragment) stickerStoreMyTabFragment).A05).A01.A01(A003, A004);
                                    AbstractC16160pM r03 = this.A0I;
                                    RecyclerView recyclerView = this.A0M;
                                    if (r03 != null) {
                                        AnonymousClass0VT r52 = recyclerView.A0S;
                                        if (r52 instanceof AbstractC07840Zv) {
                                            ((AbstractC07840Zv) r52).AM7(view, r6.A0H, i, i2);
                                            return;
                                        }
                                        if (r52.A0d()) {
                                            View view2 = r6.A0H;
                                            if (AnonymousClass0VT.A03(view2) <= recyclerView.getPaddingLeft()) {
                                                recyclerView.A0X(A002);
                                            }
                                            if (AnonymousClass0VT.A04(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                                recyclerView.A0X(A002);
                                            }
                                        }
                                        if (r52.A0e()) {
                                            View view3 = r6.A0H;
                                            if (AnonymousClass0VT.A05(view3) <= recyclerView.getPaddingTop()) {
                                                recyclerView.A0X(A002);
                                            }
                                            if (AnonymousClass0VT.A02(view3) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                                recyclerView.A0X(A002);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    throw null;
                                }
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019a, code lost:
        if (r0 > 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r28, int r29) {
        /*
        // Method dump skipped, instructions count: 491
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30511bT.A07(X.0hD, int):void");
    }

    public void A08(AbstractC11910hD r4, boolean z) {
        for (int size = this.A0O.size() - 1; size >= 0; size--) {
            C16190pP r1 = (C16190pP) this.A0O.get(size);
            if (r1.A0C == r4) {
                r1.A05 |= z;
                if (!r1.A03) {
                    r1.A0B.cancel();
                }
                this.A0O.remove(size);
                return;
            }
        }
    }

    public final void A09(float[] fArr) {
        if ((this.A0B & 12) != 0) {
            fArr[0] = (this.A05 + this.A00) - ((float) this.A0L.A0H.getLeft());
        } else {
            fArr[0] = this.A0L.A0H.getTranslationX();
        }
        if ((this.A0B & 3) != 0) {
            fArr[1] = (this.A06 + this.A01) - ((float) this.A0L.A0H.getTop());
        } else {
            fArr[1] = this.A0L.A0H.getTranslationY();
        }
    }

    @Override // X.AbstractC16420pm
    public void AE5(View view) {
        A05(view);
        AbstractC11910hD A0E2 = this.A0M.A0E(view);
        if (A0E2 != null) {
            AbstractC11910hD r0 = this.A0L;
            if (r0 == null || A0E2 != r0) {
                A08(A0E2, false);
                if (this.A0S.remove(A0E2.A0H)) {
                    AbstractC16160pM.A00(A0E2);
                    return;
                }
                return;
            }
            A07(null, 0);
        }
    }
}
