package computerDemo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ComputerFactoryTest {

    @Test
    void shouldReturnHomePc() {
        Computer homePc = ComputerFactory.getPC(ComputerType.HOME_PC);
        assertThat(homePc.getName()).isEqualTo("HP Home");
    }

    @Test
    void shouldReturnOfficePc() {
        Computer homePc = ComputerFactory.getPC(ComputerType.OFFICE_PC);
        assertThat(homePc.getName()).isEqualTo("HP Office");
    }

    @Test
    void shouldReturnStateTrueForHomePc() {
        Computer homePc = ComputerFactory.getPC(ComputerType.HOME_PC);
        assertThat(homePc.isState()).isEqualTo(true);
    }

    @Test
    void shouldReturnStateTrueForOfficePc() {
        Computer officePc = ComputerFactory.getPC(ComputerType.OFFICE_PC);
        assertThat(officePc.isState()).isEqualTo(true);
    }
}