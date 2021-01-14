package X;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.0Lo  reason: invalid class name */
public abstract class AnonymousClass0Lo extends BinderC04740Lp implements AbstractC04750Lq {
    public int A00;

    public AnonymousClass0Lo(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        C001801b.A1Y(bArr.length == 25);
        this.A00 = Arrays.hashCode(bArr);
    }

    public static byte[] A00(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public byte[] A01() {
        byte[] bArr;
        if (!(this instanceof AbstractBinderC04770Ls)) {
            return ((BinderC04790Lu) this).A00;
        }
        AbstractBinderC04770Ls r2 = (AbstractBinderC04770Ls) this;
        synchronized (r2) {
            bArr = (byte[]) r2.A00.get();
            if (bArr == null) {
                if (!(r2 instanceof BinderC04780Lt)) {
                    bArr = A00("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u001e\u0017\r080821231334Z\u0017\r360107231334Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0001 0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\r\u00000\u0001\b\u0002\u0001\u0001\u0000«V.\u0000Ø;¢\b®\no\u0012N)Ú\u0011ò«VÐXâÌ©\u0013\u0003é·TÓrö@§\u001b\u001dË\u0013\tgbNFV§wj\u0019=²å¿·$©\u001ew\u0018\u000ejG¤;3Ù`w\u00181EÌß{.XftÉáV[\u001fLjYU¿òQ¦=«ùÅ\\'\"\"Rèuäø\u0015Jd_qhÀ±¿Æ\u0012ê¿xWi»4ªyÜ~.¢vL®\u0007ØÁqT×î_d¥\u001aD¦\u0002ÂI\u0005AWÜ\u0002Í_\\\u000eUûï\u0019ûã'ð±Q\u0016Å o\u0019ÑõÄÛÂÖ¹?hÌ)yÇ\u000e\u0018«k;ÕÛU*\u000e;LßXûíÁº5à\u0003Á´±\rÒD¨î$ÿý38r«R!^Ú°ü\r\u000b\u0014[j¡y\u0002\u0001\u0003£Ù0Ö0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014Ç}Â!\u0017V%Óßkãä×¥0¦\u0006\u0003U\u001d#\u00040\u0014Ç}Â!\u0017V%Óßkãä×¥¡x¤v0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android\t\u0000ÂàFdJ00\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0001\u0001\u0000mÒRÎï0,6\nªÎÏòÌ©\u0004»]z\u0016aø®F²B\u0004ÐÿJhÇí\u001aS\u001eÄYZb<æ\u0007c±g)zzãW\u0012Ä\u0007ò\bðË\u0010)\u0012M{\u0010b\u0019ÀÊ>³ù­_¸qï&âñmDÈÙ l²ð\u0005»?âËD~s\u0010v­E³?`\tê\u0019Áaæ&Aª'\u001dýR(ÅÅ]ÛE'XÖaöÌ\fÌ·5.BLÄ6\\R52÷2Q7Y<JãAôÛAíÚ\r\u000b\u0010q§Ä@ðþ \u001c¶'ÊgCiÐ½/Ù\u0011ÿ\u0006Í¿,ú\u0010Ü\u000f:ãWbHÇïÆLqD\u0017B÷\u0005ÉÞW:õ[9\r×ý¹A1]_u0\u0011&ÿb\u0014\u0010Ài0");
                } else {
                    bArr = A00("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u000001\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u001e\u0017\r080415233656Z\u0017\r350901233656Z01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u0001 0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\r\u00000\u0001\b\u0002\u0001\u0001\u0000ÖÎ.\b\n¿â1MÑ³ÏÓ\u0018\\´=3ú\ftá½¶ÑÛ\u0013ö,\\9ßVøF=e¾ÀóÊBk\u0007Å¨íZ9ÁgçkÉ¹'K\u000b\"\u0000\u0019©)\u0015årÅm*0\u001b£oÅü\u0011:ÖËt5¡m#«}úîáeäß\u001f\n½§\nQlN\u0005\u0011Ê|\fU\u0017[ÃuùHÅj®\b¤O¦¤Ý}¿,\n5\"­\u0006¸Ì\u0018^±Uyîøm\b\u000b\u001daÀù¯±ÂëÑ\u0007êE«Ûh£Ç^TÇlSÔ\u000b\u0012\u001dç»Ó\u000eb\f\u0018áªaÛ¼Ý<d_/UóÔÃuì@p©?qQØ6pÁj\u001a¾^òÑ\u0018á¸®ó)ðf¿láD¬èm\u001c\u001b\u000f\u0002\u0001\u0003£ü0ù0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014\u001cÅ¾LC<a:\u0015°L¼\u0003òOà²0É\u0006\u0003U\u001d#\u0004Á0¾\u0014\u001cÅ¾LC<a:\u0015°L¼\u0003òOà²¡¤01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com\t\u0000Õ¸l}ÓNõ0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0001\u0001\u0000\u0019Ó\fñ\u0005ûx?L\r}Ò##=@zÏÎ\u0000\b\u001d[×ÆéÖí k\u000e\u0011 \u0006Al¢D\u0013ÒkJ àõ$ÊÒ»\\nL¡\u0001j\u0015n¡ì]ÉZ^:\u0001\u00006ôHÕ\u0010¿.\u001eag:;åm¯\u000bw±Â)ãÂUãèL]#ïº\tËñ; +NZ\"É2cHJ#Òü)ú\u00199u3¯Øª\u0016\u000fBÂÐ\u0016>fCéÁ/ Á33[Àÿk\"ÞÑ­DB)¥9©Nï­«ÐeÎÒK>QåÝ{fx{ï\u0012þû¤Ä#ûOøÌIL\u0002ðõ\u0005\u0016\u0012ÿe)9>FêÅ»!òwÁQª_*¦'Ñè§\n¶\u00035iÞ;¿ÿ|©Ú>\u0012Cö\u000b");
                }
                r2.A00 = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    @Override // X.AbstractC04750Lq
    public final IObjectWrapper AS6() {
        return new BinderC04800Lv(A01());
    }

    @Override // X.AbstractC04750Lq
    public final int ASB() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        IObjectWrapper AS6;
        if (obj != null && (obj instanceof AbstractC04750Lq)) {
            try {
                AbstractC04750Lq r5 = (AbstractC04750Lq) obj;
                if (r5.ASB() == this.A00 && (AS6 = r5.AS6()) != null) {
                    return Arrays.equals(A01(), (byte[]) BinderC04800Lv.A00(AS6));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A00;
    }
}
