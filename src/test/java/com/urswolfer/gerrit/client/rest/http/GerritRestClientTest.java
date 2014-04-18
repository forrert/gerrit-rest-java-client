/*
 * Copyright 2013-2014 Urs Wolfer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.urswolfer.gerrit.client.rest.http;

import com.urswolfer.gerrit.client.rest.GerritAuthData;
import com.urswolfer.gerrit.client.rest.GerritClient;
import com.urswolfer.gerrit.client.rest.bean.ChangeInfo;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Urs Wolfer
 */
public class GerritRestClientTest {
    @Test(enabled = false) // requires running Gerrit instance
    public void testBasicRestCallToLocalhost() throws Exception {
        GerritRestClientFactory gerritRestClientFactory = new GerritRestClientFactory();
        GerritClient gerritClient = gerritRestClientFactory.create(new GerritAuthData.BasicAuthData("http://localhost:8080"));
        List<ChangeInfo> changes = gerritClient.getChangesClient().getChanges();
        System.out.println(String.format("Got %s changes.", changes.size()));
        System.out.println(changes);
    }
}
