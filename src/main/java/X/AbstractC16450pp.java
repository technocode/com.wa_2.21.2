package X;

import android.animation.ValueAnimator;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.search.IteratingPlayer;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0pp  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16450pp {
    public void A00(RecyclerView recyclerView, int i) {
        boolean z;
        AnonymousClass0VT r1;
        View A00;
        if (this instanceof C71763Qf) {
            StickerStorePackPreviewActivity.A04(((C71763Qf) this).A00, recyclerView);
        } else if (this instanceof C71043Nj) {
            IteratingPlayer iteratingPlayer = ((C71043Nj) this).A00;
            if (i == 0) {
                iteratingPlayer.A02();
                iteratingPlayer.A03(iteratingPlayer.A01);
                iteratingPlayer.A00();
                return;
            }
            iteratingPlayer.A01();
        } else if (this instanceof C69773Ij) {
            AbstractC16450pp r0 = ((C69773Ij) this).A00.A02;
            if (r0 != null) {
                r0.A00(recyclerView, i);
            }
        } else if (this instanceof C69763Ii) {
            ((C69763Ii) this).A02(recyclerView);
        } else if (this instanceof C69733Ie) {
            C69733Ie r2 = (C69733Ie) this;
            if (i == 0) {
                r2.A02.A01();
            } else if (i == 1 && r2.A00 == 0) {
                r2.A02.A02(r2.A01);
            }
            r2.A00 = i;
        } else if (this instanceof C54562f7) {
            AbstractC54572f8 r5 = ((C54562f7) this).A00;
            boolean z2 = r5.A01;
            boolean z3 = false;
            if (i != 0) {
                z3 = true;
            }
            r5.A01 = z3;
            if (z2 != z3) {
                Iterator it = r5.A00.iterator();
                while (it.hasNext()) {
                    AbstractC11900hC r6 = (AbstractC11900hC) it.next();
                    if (r5.A01) {
                        r6.A0E(false);
                        if (r6 instanceof C73943Zl) {
                            ((C73943Zl) r6).A01.setScrolling(true);
                        }
                    } else {
                        if (!(r5 instanceof AnonymousClass3ZP)) {
                            z = true;
                        } else {
                            IteratingPlayer iteratingPlayer2 = ((AnonymousClass3ZP) r5).A0a;
                            if (iteratingPlayer2 != null) {
                                z = false;
                                if (r6.A01() == iteratingPlayer2.A00) {
                                    z = true;
                                }
                            } else {
                                throw null;
                            }
                        }
                        r6.A0E(z);
                        if (r6 instanceof C73943Zl) {
                            ((C73943Zl) r6).A01.setScrolling(false);
                        }
                    }
                }
            }
        } else if (this instanceof C54352em) {
            C54352em r22 = (C54352em) this;
            int i2 = 0;
            if (i == 0) {
                C59842oN r4 = r22.A00;
                int height = ((C53392d8) r4).A07.getHeight();
                if (((C53392d8) r4).A03 > 0 && ((C53392d8) r4).A07.A00 > (height >> 1)) {
                    i2 = height;
                }
                EmojiPopupFooter emojiPopupFooter = ((C53392d8) r4).A07;
                if (i2 != emojiPopupFooter.A00) {
                    emojiPopupFooter.startAnimation(new AnonymousClass2NZ(r4, i2));
                }
            } else if (i == 1 && recyclerView.computeVerticalScrollRange() <= recyclerView.getHeight()) {
                C59842oN r23 = r22.A00;
                EmojiPopupFooter emojiPopupFooter2 = ((C53392d8) r23).A07;
                if (emojiPopupFooter2.A00 != 0) {
                    emojiPopupFooter2.startAnimation(new AnonymousClass2NZ(r23, 0));
                }
            }
        } else if (this instanceof C53762dn) {
            MediaGalleryActivity mediaGalleryActivity = ((C53762dn) this).A00;
            MenuItem menuItem = mediaGalleryActivity.A05;
            if (menuItem != null && menuItem.isActionViewExpanded() && mediaGalleryActivity.getCurrentFocus() != null) {
                InputMethodManager A0H = mediaGalleryActivity.A0N.A0H();
                if (A0H != null) {
                    A0H.hideSoftInputFromWindow(recyclerView.getWindowToken(), 2);
                    return;
                }
                throw null;
            }
        } else if (this instanceof C53312cs) {
            C53312cs r02 = (C53312cs) this;
            if (i == 1) {
                r02.A00.A02 = true;
            } else if (i == 0) {
                r02.A00.A09.A08();
            }
        } else if (this instanceof C53102cR) {
            C53102cR r12 = (C53102cR) this;
            int i3 = r12.A02;
            if (i3 == 0 && i != i3) {
                r12.A03.A0R.clearFocus();
            }
            r12.A02 = i;
        } else if (this instanceof C42211wK) {
            ((C42211wK) this).A00.A00();
        } else if (this instanceof C37811op) {
            C37811op r52 = (C37811op) this;
            if (i == 0) {
                RunnableEBaseShape6S0200000_I1_1 runnableEBaseShape6S0200000_I1_1 = new RunnableEBaseShape6S0200000_I1_1(r52, recyclerView, 1);
                r52.A01 = runnableEBaseShape6S0200000_I1_1;
                recyclerView.postDelayed(runnableEBaseShape6S0200000_I1_1, 1500);
                return;
            }
            recyclerView.removeCallbacks(r52.A01);
            if (!r52.A02) {
                ValueAnimator valueAnimator = r52.A00;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    r52.A00.cancel();
                }
                C33641h7 r13 = r52.A03;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r13.A00, 1.0f);
                ofFloat.addUpdateListener(new C25231Ga(recyclerView, r13));
                ofFloat.setDuration(200L);
                ofFloat.start();
                r52.A02 = true;
            }
        } else if (this instanceof C37741oi) {
            C37741oi r62 = (C37741oi) this;
            if (i == 1) {
                r62.A01 = true;
            } else if (i == 0 && (r1 = recyclerView.A0S) != null && (A00 = r62.A02.A00(r1)) != null) {
                int A002 = RecyclerView.A00(A00);
                if (A002 != r62.A00 || r62.A01) {
                    C37731oh r53 = r62.A03;
                    if (r53 != null) {
                        ArrayList arrayList = new ArrayList();
                        C463229b r14 = new C463229b((double) A002);
                        if (arrayList.size() == 0) {
                            arrayList.add(r14);
                            C008805h.A0P(r53.A01, new C010106g(arrayList), r53.A00);
                            r62.A00 = A002;
                            r62.A01 = false;
                            return;
                        }
                        throw new IllegalArgumentException("arguments have to be continuous");
                    }
                    throw null;
                }
            }
        } else if (this instanceof C30651bh) {
            C30651bh r15 = (C30651bh) this;
            if (i == 0 && r15.A00) {
                r15.A00 = false;
                r15.A01.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0390, code lost:
        if (r1 != 0) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007b, code lost:
        if (r10 < r3.A0H) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008f, code lost:
        if (r5 < r3.A0H) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 943
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC16450pp.A01(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
