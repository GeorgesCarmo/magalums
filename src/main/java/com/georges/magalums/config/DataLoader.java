package com.georges.magalums.config;

import com.georges.magalums.entity.Channel;
import com.georges.magalums.entity.Status;
import com.georges.magalums.repository.ChannelRepository;
import com.georges.magalums.repository.StatusRepository;
import jdk.jshell.Snippet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final ChannelRepository channelRepository;
    private final StatusRepository statusRepository;

    public DataLoader(ChannelRepository channelRepository, StatusRepository statusRepository) {
        this.channelRepository = channelRepository;
        this.statusRepository = statusRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(Channel.values.values())
                .map(Channel.values::toChannel)
                .forEach(channelRepository::save);

        Arrays.stream(Status.values.values())
                .map(Status.values::toStatus)
                .forEach(statusRepository::save);
    }
}
