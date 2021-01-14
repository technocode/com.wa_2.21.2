package X;

import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0ps  reason: invalid class name and case insensitive filesystem */
public final class C16480ps {
    public int A00;
    public int A01;
    public C16470pr A02;
    public ArrayList A03 = null;
    public final ArrayList A04;
    public final ArrayList A05 = new ArrayList();
    public final List A06;
    public final /* synthetic */ RecyclerView A07;

    public C16480ps(RecyclerView recyclerView) {
        this.A07 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A00 = 2;
        this.A01 = 2;
    }

    public int A00(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A07;
            AnonymousClass0VR r1 = recyclerView.A0z;
            if (i < r1.A00()) {
                if (!r1.A09) {
                    return i;
                }
                return recyclerView.A0J.A00(i, 0);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State ");
        sb.append("item count is ");
        RecyclerView recyclerView2 = this.A07;
        sb.append(recyclerView2.A0z.A00());
        throw new IndexOutOfBoundsException(AnonymousClass008.A0D(recyclerView2, sb));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0177, code lost:
        if ((r0 + r15) >= r22) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0290, code lost:
        if (r19 != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x033c, code lost:
        if (r8.A08 != r12.A01(r8.A05)) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        if (r9.A09 == false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC11910hD A01(int r21, long r22) {
        /*
        // Method dump skipped, instructions count: 1236
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480ps.A01(int, long):X.0hD");
    }

    public void A02() {
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            A04(size);
        }
        arrayList.clear();
        if (RecyclerView.A1E) {
            C30451bN r1 = this.A07.A0L;
            int[] iArr = r1.A03;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            r1.A00 = 0;
        }
    }

    public void A03() {
        int i;
        AnonymousClass0VT r0 = this.A07.A0S;
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        this.A01 = this.A00 + i;
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.A01; size--) {
            A04(size);
        }
    }

    public void A04(int i) {
        ArrayList arrayList = this.A05;
        A0A((AbstractC11910hD) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void A05(View view) {
        AbstractC11910hD A012 = RecyclerView.A01(view);
        if (A012.A0A()) {
            this.A07.removeDetachedView(view, false);
        }
        C16480ps r0 = A012.A09;
        if (r0 != null) {
            r0.A09(A012);
        } else {
            int i = A012.A00;
            if ((i & 32) != 0) {
                A012.A00 = i & -33;
            }
        }
        A08(A012);
    }

    public void A06(View view) {
        AbstractC16370ph r2;
        AbstractC11910hD A012 = RecyclerView.A01(view);
        int i = A012.A00;
        boolean z = false;
        if ((12 & i) != 0) {
            z = true;
        }
        if (z || (i & 2) == 0 || (r2 = this.A07.A0R) == null || r2.A08(A012, A012.A02())) {
            if (A012.A08() && !A012.A09()) {
                RecyclerView recyclerView = this.A07;
                if (!recyclerView.A0N.A00) {
                    throw new IllegalArgumentException(AnonymousClass008.A0D(recyclerView, AnonymousClass008.A0S("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
                }
            }
            A012.A09 = this;
            A012.A0G = false;
            this.A04.add(A012);
            return;
        }
        ArrayList arrayList = this.A03;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A03 = arrayList;
        }
        A012.A09 = this;
        A012.A0G = true;
        arrayList.add(A012);
    }

    public final void A07(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A07((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r1.hasTransientState() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AbstractC11910hD r13) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480ps.A08(X.0hD):void");
    }

    public void A09(AbstractC11910hD r2) {
        if (r2.A0G) {
            this.A03.remove(r2);
        } else {
            this.A04.remove(r2);
        }
        r2.A09 = null;
        r2.A0G = false;
        r2.A00 &= -33;
    }

    public void A0A(AbstractC11910hD r6, boolean z) {
        TextureView$SurfaceTextureListenerC60532pe r1;
        MediaPlayer mediaPlayer;
        RecyclerView.A04(r6);
        boolean z2 = false;
        if ((16384 & r6.A00) != 0) {
            z2 = true;
        }
        if (z2) {
            r6.A05(0, 16384);
            AnonymousClass0Q7.A0d(r6.A0H, null);
        }
        if (z) {
            RecyclerView recyclerView = this.A07;
            AbstractC16300pa r12 = recyclerView.A0N;
            if (r12 != null) {
                if (!(r12 instanceof AnonymousClass3R7)) {
                    if (r12 instanceof AbstractC54572f8) {
                        AbstractC11900hC r13 = (AbstractC11900hC) r6;
                        if (r13 instanceof C73943Zl) {
                            AnonymousClass3ON r14 = ((C73943Zl) r13).A01;
                            if (r14 instanceof C74913bm) {
                                MessageGifVideoPlayer messageGifVideoPlayer = ((C74913bm) r14).A05;
                                messageGifVideoPlayer.setVisibility(8);
                                MediaPlayer mediaPlayer2 = messageGifVideoPlayer.A02;
                                if (mediaPlayer2 != null) {
                                    mediaPlayer2.release();
                                    messageGifVideoPlayer.A02 = null;
                                    messageGifVideoPlayer.A09 = false;
                                    messageGifVideoPlayer.A0A = false;
                                    messageGifVideoPlayer.A0C = false;
                                }
                            }
                        } else if ((r13 instanceof TextureView$SurfaceTextureListenerC60532pe) && (mediaPlayer = (r1 = (TextureView$SurfaceTextureListenerC60532pe) r13).A01) != null) {
                            mediaPlayer.release();
                            r1.A01 = null;
                            r1.A06 = false;
                            r1.A05 = false;
                            r1.A07 = false;
                        }
                    } else if (r12 instanceof C53812ds) {
                        C59592ny r15 = ((C53822dt) r6).A00;
                        r15.setImageBitmap(null);
                        r15.A00 = null;
                    } else if (r12 instanceof C50822We) {
                        C60522pc r16 = ((View$OnClickListenerC50812Wd) r6).A00;
                        r16.setImageDrawable(null);
                        ((C59592ny) r16).A00 = null;
                    } else if (r12 instanceof AnonymousClass276) {
                        C33661h9 r4 = (C33661h9) r6;
                        ((AnonymousClass11A) r4.A0H).setRenderTree(null);
                        r4.A00 = null;
                    }
                } else if (r6 instanceof AnonymousClass3R3) {
                    ((AnonymousClass3R3) r6).A0C();
                }
            }
            if (recyclerView.A0z != null) {
                recyclerView.A12.A02(r6);
            }
        }
        r6.A0C = null;
        C16470pr r3 = this.A02;
        if (r3 == null) {
            r3 = new C16470pr();
            this.A02 = r3;
        }
        if (r3 != null) {
            int i = r6.A02;
            ArrayList arrayList = r3.A00(i).A03;
            if (((C16460pq) r3.A01.get(i)).A00 > arrayList.size()) {
                r6.A03();
                arrayList.add(r6);
                return;
            }
            return;
        }
        throw null;
    }
}
