package euclidean;

/**
 * Finds <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor">greatest common divisor</a>
 * for two integers using Euclidean algorithm.
 * <p>
 * Further information <a href="https://en.wikipedia.org/wiki/Euclidean_algorithm">Euclidean algorithm wiki</a>
 *
 * @author Daniel Sram
 */
public class GreatestCommonDivisor {

    public static int find(int u, int w) {
        return (0 == w) ? u : find(w, u % w);
    }

}
