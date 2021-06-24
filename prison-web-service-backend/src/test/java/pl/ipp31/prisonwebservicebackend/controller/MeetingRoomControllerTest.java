package pl.ipp31.prisonwebservicebackend.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class MeetingRoomControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnOkOnGetAllMethod() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/meetingrooms/all"))
                .andDo(print())
                .andExpect(status().is(200))
                .andReturn();

        assertThat(mvcResult).isNotNull();
        Assertions.assertNotEquals("",mvcResult.getResponse().getContentAsString());
    }
}
