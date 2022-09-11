public class JavaDocs {
    /**
     * Brief summary of the class, ending with a period.
     * <p>
     * It is common to leave a blank line between the summary and further details.
     * The summary (everything before the first period) is used in the class or package overview section.
     * <p>
     * The following inline tags can be used (non-exhaustive)
     * {@link some.other.class.Documentation} for linking to other docs or symbols
     * {@link some.other.class.Documentation Some Display Name} the link's appearance can be customized
     * by adding a display name after the doc or symbol locator
     * {@code code goes here} for formatting as code
     * {@literal <>[]()foo} for interpreting literal text without converting to HTML markup or other tags
     *
     * Optionally, the following tags may be used at the end of class documentation
     * @author Jupiter Bradley
     * @version 1.0
     * @since 08/10/2022
     * @see some.other.class.Documentation
     * @deprecated This class has been replaced by some.other.package.BetterJavadocs
     */
    // Above is an example of a JavaDoc class documentation.

    public void methodJavadoc() {
        /**
         * Brief summary of the method, ending with a period.
         *
         * Further description of method and what it does, including as much detail as appropriate.
         * Inline tags such as {@code code here}, {@link some.other.Docs} and {@literal text here}
         * can be used.
         *
         * If a method overrides a superclass method, {@inheritdoc} can be used to copy the documentation
         * from the superclass method.
         *
         * @param stream Describe this parameter. Inclide as much detail as appropriate.
         *               Parameter docs are commonly aligned like here, but this is optional.
         *               As with other docs, the documentation before the first period is used
         *               as a summary.
         *
         * @return Describe the return values. Include as much detail as is appropriate. Return
         *         type docs are commonly aligned as here, but this is optional. As with other docs,
         *         the documentation before the first period is used as a summary.
         *
         * @throws java.io.IOException Describe when this exception can be thrown. Exception docs are commonly
         *                             aligned as here, but this is optional. As with other docs, the
         *                             documentation before the first period is used as a summary.
         *                             Instead of @throws, @exception can also be used.
         *
         * @since 2.1.0
         * @see some.other.class.Documentation
         * @deprecated Describe why this method is outdated. A replacement can also be specified.
         */
    }
}
