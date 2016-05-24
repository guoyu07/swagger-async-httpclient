package io.swagger.client

import com.typesafe.scalalogging.Logger
import org.slf4j.LoggerFactory

trait Logging {
  @transient protected val logger = Logger(LoggerFactory.getLogger(getClass))
}
