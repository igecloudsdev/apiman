/*
 * Copyright 2022 Scheer PAS Schweiz AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.apiman.manager.api.beans.contracts;

/**
 * @author Marc Savy {@literal <marc@blackparrotlabs.io>}
 */
public enum ContractStatus {
    /**
     * Contract is in a pending state awaiting approval.
     */
    AwaitingApproval,

    /**
     * Contract has been successfully created.
     */
    Created,

    /**
     * Contract has been rejected.
     */
    Rejected
}
