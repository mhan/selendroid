/*
 * Copyright 2014 eBay Software Foundation and selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.selendroid.server.handler;

import io.selendroid.server.BaseSelendroidServerHandler;
import io.selendroid.server.Response;
import io.selendroid.server.SelendroidResponse;
import io.selendroid.server.model.ActiveSession;

import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;
import io.selendroid.server.http.HttpRequest;

public class AdbSendText extends BaseSelendroidServerHandler {
  private static final Logger log = Logger.getLogger(AdbSendText.class.getName());

  public AdbSendText(String mappedUri) {
    super(mappedUri);
  }

  @Override
  public Response handle(HttpRequest request) throws JSONException {
    JSONObject payload = getPayload(request);
    log.info("Send text via adb: " + payload.toString(2));
    ActiveSession session = getSelendroidDriver(request).getActiveSession(getSessionId(request));

    session.getDevice().runAdbCommand("shell input text '" + payload.getString("text") + "'");
    return new SelendroidResponse(getSessionId(request), "");
  }
}
