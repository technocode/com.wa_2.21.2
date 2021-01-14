package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: X.01W  reason: invalid class name */
public class AnonymousClass01W extends Resources {
    public Resources A00;
    public final AnonymousClass01X A01;

    public AnonymousClass01W(Resources resources, AnonymousClass01X r5) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.A00 = resources;
        this.A01 = r5;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        return this.A00.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.A00.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        return this.A00.getColor(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i, Resources.Theme theme) {
        return this.A00.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        return this.A00.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.A00.getColorStateList(i, theme);
    }

    public Configuration getConfiguration() {
        return this.A00.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.A00.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.A00.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.A00.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.A00.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        return this.A00.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.A00.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        return this.A00.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A00.getDrawableForDensity(i, i2, theme);
    }

    public float getFloat(int i) {
        return this.A00.getFloat(i);
    }

    @Override // android.content.res.Resources
    public Typeface getFont(int i) {
        return this.A00.getFont(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.A00.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.A00.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        return this.A00.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.A00.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        return this.A00.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        return this.A00.getMovie(i);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return this.A01.A08(i, (long) i2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        AnonymousClass01X r0 = this.A01;
        return String.format(r0.A0I(), r0.A08(i, (long) i2), objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return this.A01.A08(i, (long) i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        return this.A00.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        return this.A00.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        return this.A00.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        return this.A00.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        return this.A01.A06(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        AnonymousClass01X r0 = this.A01;
        return String.format(r0.A0I(), r0.A06(i), objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return this.A00.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        return this.A01.A06(i);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        String A06;
        return (i == 0 || (A06 = this.A01.A06(i)) == null) ? charSequence : A06;
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return this.A00.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.A00.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.A00.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A00.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        return this.A00.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.A00.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        return this.A00.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        return this.A00.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.A00.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.A00.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A00.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A00.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.A00;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
