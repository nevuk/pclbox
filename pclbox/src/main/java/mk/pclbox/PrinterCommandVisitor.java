package mk.pclbox;

/*
 * Copyright 2017 Michael Knigge
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

/**
 * Visitor for all concrete implementations of {@link PrinterCommand}.
 */
public interface PrinterCommandVisitor {

    /**
     * Handle method for {@link TextCommand} objects.
     */
    void handle(final TextCommand command);

    /**
     * Handle method for {@link ControlCharacterCommand} objects.
     */
    void handle(final ControlCharacterCommand command);

    /**
     * Handle method for {@link TwoBytePclCommand} objects.
     */
    void handle(final TwoBytePclCommand twoBytePclCommand);

    /**
     * Handle method for {@link ParameterizedPclCommand} objects.
     */
    void handle(final ParameterizedPclCommand parameterizedPclCommand);

    /**
     * Handle method for {@link PjlCommand} objects.
     */
    void handle(final PjlCommand pjlCommand);
}
