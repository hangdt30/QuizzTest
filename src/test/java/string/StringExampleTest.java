package string;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StringExampleTest {
    @Test
    @DisplayName("CountTheUppercase")
    public void checkNumOfUppercase() {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(StringExample.countUpperCase(str)).isEqualTo(7);
    }
    @Test
    @DisplayName("Uppercase1stWords")
    public void checkStringUppercase() {
        String str = "you Only Live Once. But if You do it right. once is Enough";
        assertThat(StringExample.uppercase1stCharacters(str)).isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough");
    }
    @Test
    @DisplayName("StandardizedString")
    public void checkStandardized() {
        String str = "you Only Live Once. But if You do it right. once is Enough";
        assertThat(StringExample.standardized(str)).isEqualTo("You only live once. But if you do it right. Once is enough");
    }

}
