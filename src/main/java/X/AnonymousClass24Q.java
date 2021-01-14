package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.24Q  reason: invalid class name */
public class AnonymousClass24Q extends AnonymousClass0VA implements Animatable {
    public Animator.AnimatorListener A00;
    public ArgbEvaluator A01;
    public Context A02;
    public C17430rW A03;
    public ArrayList A04;
    public final Drawable.Callback A05;

    public AnonymousClass24Q() {
        this(null);
    }

    public AnonymousClass24Q(Context context) {
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        this.A05 = new C17410rU(this);
        this.A02 = context;
        this.A03 = new C17430rW();
    }

    public static AnonymousClass24Q A00(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass24Q r2 = new AnonymousClass24Q(context);
            Drawable A0c = C002001d.A0c(context.getResources(), i, context.getTheme());
            ((AnonymousClass0VA) r2).A00 = A0c;
            A0c.setCallback(r2.A05);
            new C17440rX(((AnonymousClass0VA) r2).A00.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    Resources resources = context.getResources();
                    Resources.Theme theme = context.getTheme();
                    AnonymousClass24Q r0 = new AnonymousClass24Q(context);
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (XmlPullParserException e) {
            Log.e("AnimatedVDCompat", "parser error", e);
            return null;
        } catch (IOException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        }
    }

    public final void A01(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                A01(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                ArgbEvaluator argbEvaluator = this.A01;
                if (argbEvaluator == null) {
                    argbEvaluator = new ArgbEvaluator();
                    this.A01 = argbEvaluator;
                }
                objectAnimator.setEvaluator(argbEvaluator);
            }
        }
    }

    public void A02(AbstractC17400rT r3) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            Animatable2.AnimationCallback animationCallback = r3.A00;
            if (animationCallback == null) {
                animationCallback = new C17390rS(r3);
                r3.A00 = animationCallback;
            }
            animatedVectorDrawable.registerAnimationCallback(animationCallback);
            return;
        }
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A04 = arrayList;
        }
        if (!arrayList.contains(r3)) {
            this.A04.add(r3);
            Animator.AnimatorListener animatorListener = this.A00;
            if (animatorListener == null) {
                animatorListener = new C17420rV(this);
                this.A00 = animatorListener;
            }
            this.A03.A00.addListener(animatorListener);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = super.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.A03.A02.draw(canvas);
        if (this.A03.A00.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = super.A00;
        if (drawable == null) {
            return this.A03.A02.getAlpha();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public int getChangingConfigurations() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | 0;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = super.A00;
        if (drawable == null) {
            return this.A03.A02.getColorFilter();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = super.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C17440rX(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A03.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.A03.A02.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.A03.A02.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0136, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0136 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:46:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0139  */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass24Q.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return C002001d.A3G(drawable);
        }
        return this.A03.A02.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.A03.A00.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.A03.A02.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.A03.A02.setBounds(rect);
        }
    }

    @Override // X.AnonymousClass0VA
    public boolean onLevelChange(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.A03.A02.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.A03.A02.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.A03.A02.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2d(drawable, z);
            return;
        }
        AnonymousClass0V9 r1 = this.A03.A02;
        Drawable drawable2 = ((AnonymousClass0VA) r1).A00;
        if (drawable2 != null) {
            C002001d.A2d(drawable2, z);
        } else {
            r1.A02.A09 = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        AnonymousClass0V9 r1 = this.A03.A02;
        Drawable drawable2 = ((AnonymousClass0VA) r1).A00;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        r1.A00 = colorFilter;
        r1.invalidateSelf();
    }

    @Override // X.AbstractC05200No
    public void setTint(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2Z(drawable, i);
        } else {
            this.A03.A02.setTint(i);
        }
    }

    @Override // X.AbstractC05200No
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2b(drawable, colorStateList);
        } else {
            this.A03.A02.setTintList(colorStateList);
        }
    }

    @Override // X.AbstractC05200No
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2c(drawable, mode);
        } else {
            this.A03.A02.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.A03.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.A03.A00.isStarted()) {
            this.A03.A00.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A03.A00.end();
        }
    }
}
