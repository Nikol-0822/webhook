package com.m4g.webhook.Repository;

import com.m4g.webhook.Models.MessageWebhook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageWebhookRepository  extends JpaRepository<MessageWebhook,Long> {
}
