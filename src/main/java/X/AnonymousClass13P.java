package X;

import android.util.Log;

/* renamed from: X.13P  reason: invalid class name */
public final class AnonymousClass13P {
    public static final int A00 = AnonymousClass0W2.A01("alb");
    public static final int A01 = AnonymousClass0W2.A01("ART");
    public static final int A02 = AnonymousClass0W2.A01("cmt");
    public static final int A03 = AnonymousClass0W2.A01("com");
    public static final int A04 = AnonymousClass0W2.A01("wrt");
    public static final int A05 = AnonymousClass0W2.A01("too");
    public static final int A06 = AnonymousClass0W2.A01("gen");
    public static final int A07 = AnonymousClass0W2.A01("lyr");
    public static final int A08 = AnonymousClass0W2.A01("nam");
    public static final int A09 = AnonymousClass0W2.A01("trk");
    public static final int A0A = AnonymousClass0W2.A01("day");
    public static final int A0B = AnonymousClass0W2.A01("aART");
    public static final int A0C = AnonymousClass0W2.A01("cpil");
    public static final int A0D = AnonymousClass0W2.A01("covr");
    public static final int A0E = AnonymousClass0W2.A01("disk");
    public static final int A0F = AnonymousClass0W2.A01("pgap");
    public static final int A0G = AnonymousClass0W2.A01("gnre");
    public static final int A0H = AnonymousClass0W2.A01("grp");
    public static final int A0I = AnonymousClass0W2.A01("----");
    public static final int A0J = AnonymousClass0W2.A01("rtng");
    public static final int A0K = AnonymousClass0W2.A01("soal");
    public static final int A0L = AnonymousClass0W2.A01("soaa");
    public static final int A0M = AnonymousClass0W2.A01("soar");
    public static final int A0N = AnonymousClass0W2.A01("soco");
    public static final int A0O = AnonymousClass0W2.A01("sonm");
    public static final int A0P = AnonymousClass0W2.A01("tmpo");
    public static final int A0Q = AnonymousClass0W2.A01("trkn");
    public static final int A0R = AnonymousClass0W2.A01("tvsh");
    public static final int A0S = AnonymousClass0W2.A01("sosn");
    public static final String[] A0T = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static AbstractC34101hu A00(int i, String str, C233815n r5, boolean z, boolean z2) {
        int i2;
        r5.A0C(4);
        if (r5.A00() == AnonymousClass13L.A0H) {
            r5.A0C(8);
            i2 = r5.A01();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            String num = Integer.toString(i2);
            if (z) {
                return new AnonymousClass25S(str, num);
            }
            return new AnonymousClass25Q(str, num);
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("Failed to parse uint8 attribute: ");
        A0S2.append(AnonymousClass13L.A00(i));
        Log.w("MetadataUtil", A0S2.toString());
        return null;
    }

    public static AnonymousClass25S A01(int i, String str, C233815n r6) {
        int A002 = r6.A00();
        if (r6.A00() == AnonymousClass13L.A0H && A002 >= 22) {
            r6.A0C(10);
            int A032 = r6.A03();
            if (A032 > 0) {
                String A0F2 = AnonymousClass008.A0F("", A032);
                int A033 = r6.A03();
                if (A033 > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0F2);
                    sb.append("/");
                    sb.append(A033);
                    A0F2 = sb.toString();
                }
                return new AnonymousClass25S(str, A0F2);
            }
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("Failed to parse index/count attribute: ");
        A0S2.append(AnonymousClass13L.A00(i));
        Log.w("MetadataUtil", A0S2.toString());
        return null;
    }

    public static AnonymousClass25S A02(int i, String str, C233815n r6) {
        int A002 = r6.A00();
        if (r6.A00() == AnonymousClass13L.A0H) {
            r6.A0C(8);
            return new AnonymousClass25S(str, r6.A08(A002 - 16));
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("Failed to parse text attribute: ");
        A0S2.append(AnonymousClass13L.A00(i));
        Log.w("MetadataUtil", A0S2.toString());
        return null;
    }
}
